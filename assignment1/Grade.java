package com.two95.chapter2.assignment1;

import java.util.*;

//class to determine the grade
public class Grade {

	public static void main(String[] args) {

		System.out.println("Enter the marks");
		Scanner m = new Scanner(System.in);
		//Condition checking using if loops
		int mark = m.nextInt();
		if (mark > 0 || mark < 100) {
			if (mark < 35) {
				System.out.println("Fail");
			} else if (mark < 50) {
				System.out.println("C grade");
			} else if (mark < 60) {

				System.out.println("B grade");
			} else if (mark < 80) {
				System.out.println("A grade");
			} else
				System.out.println("A+ grade");
		} else
			System.out.println("Mark not valid");
	}

}
