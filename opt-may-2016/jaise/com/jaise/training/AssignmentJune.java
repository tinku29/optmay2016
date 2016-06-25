package com.jaise.training;

import java.util.Scanner;

public class AssignmentJune {
	//method to find the grade
	static void grade() {
		System.out.println("Enter the marks");
		Scanner m = new Scanner(System.in);
		// Condition checking using if loops
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
	//method to find whether eligible to vote
	static void vote() {
		System.out.println("Enter your age: ");
		Scanner a = new Scanner(System.in);
		int age = a.nextInt();
		if (age >= 18) {

			System.out.println("Congrats! You are eligible to vote.");
		} else
			System.out.println("Sorry you are not eligible to vote.");
	}
	// method to find all odd numbers between 1 to 100
	static void odd() {

		for (int i = 1; i <= 100; i++) {
			// if loop to check the conditions
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
	}
	// method to find all prime numbers between 1 to 100
	static void prime() {
		System.out.println("the prime numbers are ");
		// variable i to iterate all numbers from 1 to 100
		for (int i = 1; i < 101; i++) {
			// to skip checking 1 and 2
			if (i == 1 || i == 2) {
				System.out.println(i + " ");
			}
			// to check all the rest numbers from 3 to 100
			else {
				int counter = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						counter++;
					}
				}
				if (counter == 0) {
					System.out.println(i);
				}
			}
		}
	}
	// method to print numbers in a pattern
	static void pattern(){
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
	// method to determin the current month
	static void currentmonth(){
		String[] month = new String[12];
		month[0] = "January";
		month[1] = "February";
		month[2] = "March";
		month[3] = "April";
		month[4] = "May";
		month[5] = "June";
		month[6] = "July";
		month[7] = "August";
		month[8] = "September";
		month[9] = "October";
		month[10] = "November";
		month[11] = "December";

		System.out.println("Enter the number");
		Scanner nu = new Scanner(System.in);
		int numb = nu.nextInt();
		System.out.print("The month is " + month[numb - 1]);
	}

	public static void main(String[] args) {

		System.out.println("This program can be used to do multiple operations like:");
		System.out.println("1. To check the eligibility to vote.");
		System.out.println("2. To check the grade for a particular score.");
		System.out.println("3. To find all the odd numbers in between 1 and 100.");
		System.out.println("4. To find all the prime numbers between 1 and 100.");
		System.out.println("5. To print a particular pattern");
		System.out.println("6. To Find the month of the year by value");
		System.out.println("\n to perform a particular function enter the corresponding number between 1 and 6");
		;

		Scanner var = new Scanner(System.in);
		int opt = var.nextInt();

		switch (opt) {
		case 1:
			vote();
			break;
		case 2:
			grade();
			break;
		case 3:
			odd();
			break;
		case 4:
			prime();
			break;
		case 5:
			pattern();
			break;
		case 6:
			currentmonth();
			break;
		default:
			System.out.println("Invalid choice");

		}

	}

}
