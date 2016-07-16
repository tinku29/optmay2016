package com.github.ExceptionHandlingNew;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr First Name");
		String firstName = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Your GPA");
		double gpa = sc.nextDouble();
		}catch(Exception e){
			System.out.println("Not A Valid Value");
		}
		

	}

}
