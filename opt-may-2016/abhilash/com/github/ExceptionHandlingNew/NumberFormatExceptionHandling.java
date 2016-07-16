package com.github.ExceptionHandlingNew;

import java.util.Scanner;

public class NumberFormatExceptionHandling {

	public static void main(String[] args) {
		 
		String a = "a";
		String b = "m";
		
		
		/*int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
	
		System.out.println("The converted value is " + aa + bb);*/
		
		//Scanner sc = new Scanner(System.in);
		try{
			/*a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());*/
			
			int sum = Integer.parseInt(a + b);
			
			System.out.println(sum);
		}catch(NumberFormatException n){
			System.out.println(n.getMessage() + " is Number Format Exception ");
		}finally {
			System.out.println("Printing Finally ");
		}

	}

}
