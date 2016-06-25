/**
 * 
 */
package com.univ.mygame.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import javax.swing.ListCellRenderer;

import com.univ.mygame.bean.QA;
import com.univ.mygame.bean.QuestionAnswer;
import com.univ.mygame.consts.GameConstants;


/**
 * @author 
 *
 */
public class Host extends GameLogger implements Runnable {
    
    List<Contestant> contestants;
    
    // Initialize the score map
    Map<Contestant, Integer> scoreMap = new HashMap<Contestant, Integer>();
    
    public Host(List<Contestant> contestants) {
        this.contestants = contestants;
        for (Contestant c : contestants) {
            scoreMap.put(c, 0);
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
       log("Welcome to the show .....");
       
       // waiting for the host t introduse the winners
       synchronized (contestants) {
           try {
               contestants.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       
       log("Starting the show !!");
       
       try {
           Thread.sleep(3 * 1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       
       Random random = new Random();
       log("Questions begin...");
       for (int i = 1 ; i <= GameConstants.DEFAULTS.NUM_ROUNDS ; i ++ ) {
           log("Round "+i+" begin ...");
           for (int j = 1 ; j <= GameConstants.DEFAULTS.NUM_QUESTIONS; j++) {
               QA question = QuestionAnswer.questionAnswerMap.get(random.nextInt(QuestionAnswer.questionAnswerMap.size() - 1 + 1) + 1);
               log(question.getQuestion());
                for (Contestant c : contestants) {
                    synchronized (c) {
                        c.notify();
                    }
                }
                boolean allAnswered = false;
                boolean gotFirstCToAnswer = false;
                while (!allAnswered) {
                    for (Contestant c : contestants) {
                        if (!gotFirstCToAnswer && c.answeredQ) {
                            System.out.println(c.getName()+" answered the question first");
                            updatescores(c,question);
                            gotFirstCToAnswer = true;
                        }
                        allAnswered = c.answeredQ;
                    }
                }
                for (Contestant c : contestants) {
                    c.answeredQ = false;
                }
                log("got notified of answer");
           }
       }
       
       for (Contestant c : contestants) {
           c.myScore = scoreMap.get(c);
           c.exitTheShow = true;
       }
       
       log("Final scores :: "+scoreMap);
       
       for (Contestant c : contestants) {
           synchronized (c) {
               c.notify();
           }
       }
       
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       
       List<Contestant> cForLastRound = new ArrayList<Contestant>();
       
       for (Contestant c : contestants) {
           if (c.myScore >= 0) {
               cForLastRound.add(c);
           } else {
               scoreMap.remove(c);
           }
       }
       
       log("Contestants for the last round "+cForLastRound);
       
       for (Contestant c : cForLastRound) {
           synchronized (c) {
               c.notifyAll();
           }
       }
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       
       for (Contestant c : cForLastRound) {
           synchronized (c) {
               c.notify();
           }
       }
       
       updateScoresWithWager(cForLastRound);
       log("scores after wager :: "+scoreMap);
       
       log("And time for the final Who or What question.");
       
       log("what is my age? 10 or 20");
       
       for (Contestant c : cForLastRound) {
           synchronized (c) {
               c.notify();
           }
       }
       
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       
       for (Contestant c : cForLastRound) {
           updatescores(c,new QA("",20));
       }
      
       log("FINAL SCORES ::: "+scoreMap);
       
       Contestant winner = determineWinner();
       
       log("And the winner of the game is "+winner.getName());//If the scores are equal between two or more contestants due to randomness one winner is elected.
       
       log("Congratulations !! "+winner.getName());
       
       log("That's it for today. Bye and have a good night !!");
       
    }

    private Contestant determineWinner() {
        List<Entry<Contestant, Integer>> sorted = Announcer.sortedByValues(scoreMap);
        
        // return the contestant with highes score determined by sorting
        return sorted.get(0).getKey();
    }

    private void updateScoresWithWager(List<Contestant> contestants2) {
        for (Contestant c : contestants2) {
            scoreMap.put(c, scoreMap.get(c) - c.amtToWager);
        }
        
    }

    private void updatescores(Contestant c,
                              QA question) {
        if (isCorrect(c,question)) {
            scoreMap.put(c, scoreMap.get(c) + 1);
            log(c.getName()+" answered the question correctly.");
        } else {
            scoreMap.put(c, scoreMap.get(c) - 1);
            log(c.getName()+" lost a point due to incorrect answer.");
        }
        
        
    }

    private boolean isCorrect(Contestant c, QA question) {
        int k = (int)(question.getAnswer()*(65/100));
        int min = question.getAnswer() - (question.getAnswer() - k);
        int max = question.getAnswer() + k;
        if (c.answer >= min && c.answer <= max) {
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "Host : ";
    }

}
