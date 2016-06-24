package com.two95.Assignment02;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Enter a number");
	      Scanner input=new Scanner(System.in);
	      int a =input.nextInt();
	    
	      if((a&1)==0)
	      {
	    	  System.out.println("The number is even");
	      }
	      else
	      {
	    	  System.out.println("The number is odd");
	      }
	}

	
	
}
