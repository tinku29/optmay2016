/**
 * 
 */
package com.two95.BasicAssignments;
import java.util.Scanner;

/**
 * @author sooraj
 *
 */
public class grades {

	/**printing grades
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int a;
		System.out.println("Enter a value");
		a=in.nextInt();
		if (a<0 ||a>100)
			System.out.println("Not valid");
		
		else if (a<=34)
			System.out.println("Fail");
			
		else if (a>=35 && a<=49)
			System.out.println("C grade");
		else if (a>=50 && a<=59)
			System.out.println("B grade");
		else if (a>=60 && a<=79)
			System.out.println("A grade");
		else System.out.println("A+ grade");
		
	
		

	}

}




	

	

		
	

	