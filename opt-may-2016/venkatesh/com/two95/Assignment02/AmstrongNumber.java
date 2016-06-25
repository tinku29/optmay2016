package com.two95.Assignment02;
import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int num=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=input.nextInt();
		
		amstrongNo(num);
	}

	public static void amstrongNo(int number) {
		int temp = 0;
		int digit = 0;
		int sum = 0;
		temp = number;
		while (temp != 0) {
			digit++;
			temp = temp / 10;
		}

		temp = number;

		while (temp != 0) {
			int rem = temp % 10;
			
			sum = sum + power(rem, digit);
			temp=temp/10;
		}

		if(number==sum)
		{
			System.out.println("it is Amstrong number");
		}
		else
		{
			System.out.println("it is not a Amstrong number");

		}
	}

	public static int power(int no, int dig) {

		int sum = 1;
		for (int i = 0; i < dig; i++) {
			sum = sum * no;
		}

		return sum;
	}

}
