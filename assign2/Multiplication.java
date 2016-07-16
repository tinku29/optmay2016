package com.two95.assign.assign2;

public class Multiplication {
	public static void multiply(int x, int y) {

		int a = x;
		int b = y;
		int result = 0;

		while (b != 0) {

			if ((b & 1) != 0) {
				result = result + a;
			}
			a = a << 1;
			b >>= 1;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {

		multiply(17, 17);
	}

}
