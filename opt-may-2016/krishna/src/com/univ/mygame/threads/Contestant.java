/**
 * 
 */
package com.univ.mygame.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.univ.mygame.bean.Group;
import com.univ.mygame.bean.QuestionAnswer;

/**
 * @author 
 *
 */
public class Contestant extends GameLogger implements Runnable {
    
    private int id = 0;
    public Group grpAcc;
    public boolean winner = false;
    public boolean exitTheShow = false;
    public boolean answeredQ = false;
    public int amtToWager = 0;
    public int myScore = 0;
    public int answer = 0;
    
    public Contestant(int id, Group grpAcc) {
        this.id = id;
        this.grpAcc = grpAcc;
    }
    
    public void formGroup() {
        log("Hello... Joining Room : "+grpAcc.getId());
        grpAcc.add(this);
    }
    
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        // join a group
        formGroup();
        log("Waiting for instructions");
        
        // wait for instructions
        synchronized (grpAcc) {
            try {
                grpAcc.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        log("Taking seat in the room");
        
        // wait for instructions
        synchronized (grpAcc) {
            try {
                grpAcc.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        log("Taking the test");
        
        // wait for instructions
        synchronized (grpAcc) {
            try {
                grpAcc.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        log("Waiting for the results");
        
        // wait for instructions
        synchronized (grpAcc) {
            try {
                grpAcc.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        if (winner) {
            log("Ready for the host to begin the show.");
            while (!exitTheShow) {
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    int sleeptime = randomWithRange(1, 4);
                    Thread.sleep(sleeptime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.answer = randomWithRange(1, 150);
                this.answeredQ = true;
            }
            
         // Wait for score calculation
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            if (this.myScore < 0) {
                log("Negative score ... exiting. Bye !!");
            } else {
             // Wait for furthur instructions
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                Random random = new Random();
                try {
                    amtToWager = random.nextInt(myScore - 1 + 1) + 1;
                } catch(Exception e) {
                    amtToWager = myScore;
                }
                
                log("Amount to wager : "+amtToWager);
                
                // Wait for furthur instructions
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                Collections.shuffle(QuestionAnswer.finalAnswers);
                
                this.answer = QuestionAnswer.finalAnswers.get(0);
                
                log("Answered the final question and exited.");
            }
            
            
        }
        
    }
    
    int randomWithRange(int min, int max)
    {
       int range = (max - min) + 1;     
       return (int)(Math.random() * range) + min;
    }

    @Override
    public String getName() {
        return "Contestant-"+id;
    }
    
    @Override
    public String toString() {
        return getName();
    }

}
