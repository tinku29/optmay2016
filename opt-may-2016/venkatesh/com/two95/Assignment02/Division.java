package com.two95.Assignment02;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(division(a, b));
	}

	public static int division(int nu, int de) {
		int temp = 1;
		int quotient = 0;

		while (de <= nu) {
			de <<= 1;
			temp <<= 1;
		}

		while (temp > 1) {
			de >>= 1;
			temp >>= 1;

			if (nu >= de) {
				nu -= de;

				quotient += temp;
			}
		}

		return quotient;
	}
}
