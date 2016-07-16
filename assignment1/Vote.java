package com.two95.chapter2.assignment1;

import java.util.*;

// to check the eligibility to vote
public class Vote {

	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner a = new Scanner(System.in);
		int age = a.nextInt();
		if (age >= 18) {

			System.out.println("Congrats! You are eligible to vote.");
		} else
			System.out.println("Sorry you are not eligible to vote.");

	}

}
