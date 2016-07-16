package com.github.ExceptionHandling;

import java.util.Scanner;

public class NullPointerExceptionHandling {
	
	public void add(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a=sc.nextInt();;
		System.out.println("Enter b value ");
		int b=sc.nextInt();
		int sum = a +b;
		System.out.println("sum of 'a' and 'b' is " + sum);
		
	}
	
	
	public void nullTest(){
		
		System.out.println("Testing The Null Exception ");
	}
	

	public static void main(String[] args) {
 
		
		
		try{
			// created a proper object
			NullPointerExceptionHandling np = new NullPointerExceptionHandling();
			np.add();
			
			// created a null object
			System.out.println("\n-------------------");
			NullPointerExceptionHandling npe = null /*new NullPointerExceptionHandling()*/;
			npe.add();
			
			
			 
			
		}catch(NullPointerException ne){
			System.out.println("NullPointer Exception");
		}
		
		
	}

}
