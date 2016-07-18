package com.github.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
		try{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Value of num1");
			double num1= sc.nextDouble();
			System.out.println("Enter The Value of num2");
			double num2 = sc.nextDouble();
			
	        double result = num1/num2;
	        
	         System.out.println ("Result of num1/num2 = " + result);
	      }
	      catch(ArithmeticException ae){
	         System.out.println (ae.getMessage() + "---> Arithmetic Exception: You can't divide an integer by 0");
	      }catch(InputMismatchException im){
	    	  System.out.println( im.getMessage() + "---> NumberFormatException ");
	      }finally{
	    	  
	    	  System.out.println("\nFinally Result");
	    	  int a = 10;
	    	  int b = 10;
	    	  int sum = a+b;
	    	  System.out.println("sum of a + b is " + sum);
	      }

	}

}
