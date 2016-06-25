package com.two95.Assignment02;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter two numbers");
      Scanner input=new Scanner(System.in);
      int a =input.nextInt();
      int b=input.nextInt();
      
      
		System.out.println("the numbers before swapping a="+a+"b="+b);
      swapNumber(a,b);
		
	}

	public static void swapNumber(int a, int b)
	{
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("the numbers after swapping a="+a+"b="+b);
	}
}
