package com.github.assignment2;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER 'n' VALUE");
		int n = sc.nextInt();
		System.out.println("ENTER 'm' VALUE");
	   	int m = sc.nextInt();
	    int sum;
	    
	    sum= -(-n)-(-m);
	    System.out.println("THE SUM OF 'n' AND 'm' IS " + sum);
	   		
	}

}
