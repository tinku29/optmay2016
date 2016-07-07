/**
 * 
 */
package src.com.univ.mygame.bean;


/**
 * @author 
 */
public class QA {
    
    private String question;
    private Integer answer;
    
    public QA(String question,
              Integer answer) {
        this.question = question;
        this.answer = answer;
    }

    
    public String getQuestion() {
        return question;
    }

    
    public Integer getAnswer() {
        return answer;
    }
    
    

}
