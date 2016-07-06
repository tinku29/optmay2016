package com.two95.chapter6;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try{
			int k=i/j;
			System.out.println(k);
		}
		catch(java.lang.ArithmeticException ae){
			System.out.println("Airthemetic Exception handled");
		}
		System.out.println("Hello World");
}
}
