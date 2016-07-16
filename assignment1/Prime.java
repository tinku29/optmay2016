package com.two95.chapter2.assignment1;

// class to find the prime numbers between 1 to 100
public class Prime {

	public static void main(String[] args) {
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
}
