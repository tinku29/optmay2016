package com.two95.Assignment01;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int number) {
		boolean result = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
			}

		}
		return result;
	}
}
