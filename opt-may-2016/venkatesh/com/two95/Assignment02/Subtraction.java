package com.two95.Assignment02;
import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int result = sub(a, b);
		System.out.println(result);
	}

	public static int sub(int a, int b) {
		int result = 0;
		if (a > b) {
			for (int i = b; i < a; i++) {
				result++;
			}
		} else if (b > a) {

			for (int i = a; i < b; i++) {
				result++;
			}
			result = -result;
		}
		return result;
	}

}
