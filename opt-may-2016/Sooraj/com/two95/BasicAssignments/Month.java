/**
 * 
 */
package com.two95.BasicAssignments;
import java.util.Scanner;

/**
 * @author sooraj
 *
 */
public class Month {

	/** printing months for corresponding numbers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.println("Enter a value");
		a=in.nextInt();
		if (a==1)
			System.out.println("Its January");
		else if (a==2)
			System.out.println("Its February");
		else if (a==3)
			System.out.println("Its March");
		else if (a==4)
			System.out.println("Its April");
		else if (a==5)
			System.out.println("Its May");
		else if (a==6)
			System.out.println("Its June");
		else if (a==7)
			System.out.println("Its July");
		else if (a==8)
			System.out.println("Its August");
		else if (a==9)
			System.out.println("Its September");
		else if (a==10)
			System.out.println("Its October");
		else if (a==11)
			System.out.println("Its November");
		else if (a==12)
			System.out.println("Its December");
			
	}

}
