package com.two95.chapter2.assignment1;

// class to find the odd numbers between 1 to 100
public class odd {

	public static void main(String[] args) {
		//couter to increase the numbers
		for (int i = 1; i <= 100; i++) {
			//if loop to check the conditions
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}

	}

}
