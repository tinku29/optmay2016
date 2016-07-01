package com.two95.Assignment01;
import java.util.Scanner;

public class VotingElegible {

	public static void main(String[] args) {
		votingEligible();

	}

	public static void votingEligible() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age:");

		int age = Integer.parseInt(input.next());

		if (age >= 18) {
			System.out.println(" Congrats! You are eligible to vote");
		} else {
			System.out.println("your not eligible to vote");
		}

	}

}
