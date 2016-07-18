package com.github.ExceptionHandling;

 
import java.io.IOException;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 
		try{
			if (i <10){
				throw new Exception("Number is less than 10");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}

class UserException extends Exception {
	public UserException(String output){
		super(output);
	}
}