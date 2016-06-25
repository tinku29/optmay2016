/**
 * 
 */
package com.univ.mygame.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.univ.mygame.bean.Group;
import com.univ.mygame.consts.GameConstants;
import com.univ.mygame.threads.Announcer;
import com.univ.mygame.threads.Contestant;


/**
 * @author 
 * 
 * Main class which starts the game.
 *
 */
public class StartGame {
    
    /**
     * @param args
     * 
     * Main method to accept the parameters and 
     * kick's off the game. Uses default parameters if not present.
     *  
     */
    public static void main(String[] args) {
        System.out.println("Starting the game Who or What ....");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to accept the default arguments to start the game [y/n]");
        
        while (sc.hasNext() && (sc.nextLine().equalsIgnoreCase("n"))) {
            try {
                System.out.println("Enter no. rounds for the game");
                String in = sc.nextLine();
                GameConstants.DEFAULTS.NUM_ROUNDS = Integer.parseInt(in);
                
                System.out.println("Enter no. contestants for the game");
                in = sc.nextLine();
                GameConstants.DEFAULTS.NUM_OF_CONTESTANTS = Integer.parseInt(in);
                
                System.out.println("Enter no. questions for the game");
                in = sc.nextLine();
                GameConstants.DEFAULTS.NUM_QUESTIONS = Integer.parseInt(in);
                
                System.out.println("Enter room capacity for the game");
                in = sc.nextLine();
                GameConstants.DEFAULTS.ROOM_CAPACITY = Integer.parseInt(in);
                
                System.out.println("Continue?[Y/N]");
            } catch (Exception e) {
                System.out.println("Invalid argument ... exiting !!");
                System.exit(1);
            }
            
        }
        
        // initialize the contestant threads 
        // to join sppropriate rooms.
        List<Group> groups = initializeContestants();

        // Initialize and Start the Announcer thread
        new Announcer(groups).run();
        
    }
    
    private static List<Group> initializeContestants() {
        List<Group> groups = new ArrayList<Group>();
        int groupId = 0;
        Group grp = new Group(groupId);
        // Initialize the contestants
        for (int i = 1; i <= GameConstants.DEFAULTS.NUM_OF_CONTESTANTS; i++) {
            if (i % GameConstants.DEFAULTS.ROOM_CAPACITY == 1) {
                grp = new Group(++groupId);
                groups.add(grp);
            }
            new Thread(new Contestant(i, grp)).start();
        }
        return groups;
    }
}
