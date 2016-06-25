/**
 * 
 */
package com.univ.mygame.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.univ.mygame.bean.Group;
import com.univ.mygame.consts.GameConstants;


/**
 * @author 
 *
 */
public class Announcer extends GameLogger implements Runnable {
    
    private List<Group> groups;
    
    public Announcer(List<Group> groups) {
        this.groups = groups;
    }
    
    @Override
    public String getName() {
        return "Announcer";
    }
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        log("Welcome to Who or What ......");
        
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log("Please take a seat in your respective rooms for the test to begin ...");
        // notifying groups to take their seat
        // in their respective rooms
        for (Group grp : groups) {
            synchronized (grp) {
                grp.notifyAll();
            }
        }
        
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        log("Exam begins for a duration of "+GameConstants.DEFAULTS.EXAM_TIME +" secs");
        
        try {
            Thread.sleep(GameConstants.DEFAULTS.EXAM_TIME * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // notifying groups to start the test
        for (Group grp : groups) {
            synchronized (grp) {
                grp.notifyAll();
            }
        }
        
        try {
            Thread.sleep(GameConstants.DEFAULTS.EXAM_TIME * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // notifying groups to start the test
        for (Group grp : groups) {
            synchronized (grp) {
                grp.notifyAll();
            }
        }
        
        log("Determining the winners");
        List<Contestant> winners = determineWinners();
        
        log("And the winners are ...");
        
        for (Contestant c : winners) {
            log("winner :::: "+c.getName());
        }
        
        log("Congratulations to the winners !! ");
        log("May I welcome your host ...");
        
        Thread host = new Thread(new Host(winners));
        host.start();
        
        log("Introducing the winners...");
        
        for (int i = 0 ; i < winners.size(); i++) {
            log("Winner number "+i+" is "+winners.get(i).getName());
            winners.get(i).winner = true;
        }
        // notifying groups to start the test
        for (Group grp : groups) {
            synchronized (grp) {
                grp.notifyAll();
            }
        }
        
        // notifying groups to start the test
        synchronized (winners) {
            winners.notifyAll();
        }
        
        
    }

    private List<Contestant> determineWinners() {
        Map<Contestant, Integer> temp = new HashMap<Contestant, Integer>();
        
        Random random = new Random();
        int i = 1;
        for (Group grp : groups) {
            for (Contestant c : grp.contestants) {
                temp.put(c, random.nextInt(1000 - 1 + 1) + 1);
                i++;
            }
        }
        
        // Sort the map based on values
        // to determine the first 4 winners
        List<Entry<Contestant, Integer>> temp1 = sortedByValues(temp);
        
        List<Contestant> winners = new ArrayList<Contestant>();
        int j = 1;
        for (Entry<Contestant, Integer> entry : temp1) {
            winners.add((Contestant)entry.getKey());
            if (j == 4) {
                break;
            }
            j++;
        }
        return winners;
    }
    
    static <K, V extends Comparable<? super V>> List<Entry<K, V>> sortedByValues(Map<K, V> map) {

        List<Entry<K, V>> sortedEntries = new ArrayList<Entry<K, V>>(map.entrySet());

        Collections.sort(sortedEntries, new Comparator<Entry<K, V>>() {

            @Override
            public int compare(Entry<K, V> e1, Entry<K, V> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        return sortedEntries;
    }

}
