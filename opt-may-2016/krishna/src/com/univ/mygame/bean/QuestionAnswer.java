/**
 * 
 */
package src.com.univ.mygame.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 
 *
 */
public class QuestionAnswer {
    
    
    
    public static Map<Integer, QA> questionAnswerMap = new HashMap<Integer,QA>();
    
    static {
        questionAnswerMap.put(1, new QA("What is the price of iphone?", 10));
        questionAnswerMap.put(2, new QA("What is the price of ipad?", 15));
        questionAnswerMap.put(3, new QA("What is the price of samsumg galaxy?", 5));
        questionAnswerMap.put(4, new QA("What is the price of xx?", 20));
        questionAnswerMap.put(5, new QA("What is the price of iptt?", 25));
        questionAnswerMap.put(6, new QA("What is the price of ipne?", 30));
        questionAnswerMap.put(7, new QA("What is the price of ifff?", 35));
        questionAnswerMap.put(8, new QA("What is the price of iphgggg?",40 ));
        questionAnswerMap.put(9, new QA("What is the price of iphfda?", 45));
        questionAnswerMap.put(10, new QA("What is the price of iphfds?", 50));
        questionAnswerMap.put(11, new QA("What is the price of ipsdfs?", 60));
        questionAnswerMap.put(12, new QA("What is the price of ies?", 70));
        questionAnswerMap.put(13, new QA("What is the price of isdfs?", 80));
        questionAnswerMap.put(14, new QA("What is the price of isfds?", 90));
        questionAnswerMap.put(15, new QA("What is the price of isfs?", 100));
        questionAnswerMap.put(16, new QA("What is the price of isdfds?", 55));
        questionAnswerMap.put(17, new QA("What is the price of iphone?", 65));
        questionAnswerMap.put(18, new QA("What is the price of ipad?", 75));
        questionAnswerMap.put(19, new QA("What is the price of samsumg galaxy?", 85));
        questionAnswerMap.put(20, new QA("What is the price of xx?", 95));
        questionAnswerMap.put(21, new QA("What is the price of iptt?", 6));
        questionAnswerMap.put(22, new QA("What is the price of ipne?", 16));
        questionAnswerMap.put(23, new QA("What is the price of ifff?", 21));
        questionAnswerMap.put(24, new QA("What is the price of iphgggg?", 32));
        questionAnswerMap.put(25, new QA("What is the price of iphfda?", 43));
        questionAnswerMap.put(26, new QA("What is the price of iphfds?", 54));
        questionAnswerMap.put(27, new QA("What is the price of ipsdfs?", 65));
        questionAnswerMap.put(28, new QA("What is the price of ies?", 77));
        questionAnswerMap.put(29, new QA("What is the price of isdfs?", 88));
        questionAnswerMap.put(30, new QA("What is the price of isfds?", 99));
        questionAnswerMap.put(31, new QA("What is the price of isfs?", 43));
        questionAnswerMap.put(32, new QA("What is the price of isdfds?", 60));
    }    
    
    
    public static List<Integer> finalAnswers = new ArrayList<Integer>();
    
    
    static {
        finalAnswers.add(10);
        finalAnswers.add(20);
        finalAnswers.add(10);
        finalAnswers.add(20);
    }
    

}
