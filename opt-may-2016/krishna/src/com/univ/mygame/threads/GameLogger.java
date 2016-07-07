/**
 * 
 */
package src.com.univ.mygame.threads;



/**
 * @author 
 *
 * Logs custom messages with name of the thread which calls 
 * this class
 */
public abstract class GameLogger {
    
    public abstract String getName();
    
    public void log(final String message) {
        System.out.println(getName()+" : "+message);
    }

}
