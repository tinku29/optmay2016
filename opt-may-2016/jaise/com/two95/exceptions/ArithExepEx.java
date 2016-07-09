package com.two95.exceptions;

public class ArithExepEx {
	public static void main(String args[]) {
		int iam = 10;
		int jam = 0;
		int array[] = new int[2];
		try {
			array[0] = 1;
			array[1] = 2;
			array[2] = 3;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index exception handled");
		}
		try {
			int k = iam / jam;
			System.out.println(k);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("Arithmetic Exception handled");
		}
		System.out.println("Hello World");
	}

}
