/**
 * 
 */
package src.com.univ.mygame.bean;

import java.util.concurrent.ConcurrentLinkedQueue;

import src.com.univ.mygame.consts.GameConstants;
import src.com.univ.mygame.threads.Contestant;


/**
 * @author krishna
 *
 */
public class Group {
    
    private int id = 1;
    
    public ConcurrentLinkedQueue<Contestant> contestants = null;
    
    public Group(int id) {
        contestants = new ConcurrentLinkedQueue<Contestant>();
        this.id = id;
    }
    
    /**
     * Adds contestant to a group
     * @param c
     */
    public synchronized void add(Contestant c) {
        this.contestants.add(c);
        if (this.contestants.size() == GameConstants.DEFAULTS.ROOM_CAPACITY) {
            System.out.println("Room "+id+" full !!");
        }
    }
    
    public int getId () {
        return id;
    }
    
}
