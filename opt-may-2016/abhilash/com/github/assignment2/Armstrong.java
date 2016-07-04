package com.github.assignment2;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
 	 	System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();
	    int digit;
	    int sum=0;
	    int a = n;
	    
	    while (n>0){
	     digit= n%10;
	     System.out.println(digit);
	     n=n/10;	    
	    sum =sum+(digit*digit*digit);
	    }
 	 
if( sum == a )   {
	System.out.print(a +" IS ANARMSTRONG NUMBER");
	
}
else {
	System.out.print(a + " IS NOT AN ARMSTRONG NUMBER");
}
			
		
	}

}
