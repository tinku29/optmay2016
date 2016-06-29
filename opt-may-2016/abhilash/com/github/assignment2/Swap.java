package com.github.assignment2;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER 'n' VALUE");
		int n = sc.nextInt();
		System.out.println("ENTER 'm' VALUE");
	   	int m = sc.nextInt();
	   	
	   	n=n+m;
	   	
	   	m=n-m;
	   	System.out.println("THE VALU OF m AFTER SWAP IS " + m);
	   	
	   	n=n-m;
	   	System.out.println("THE VALU OF n AFTER SWAP IS " + n);

		}

}
