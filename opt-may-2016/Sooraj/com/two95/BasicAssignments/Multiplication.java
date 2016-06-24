package com.two95.BasicAssignments;

import java.util.Scanner;

public class Multiplication {

public static void main(String[] args){
	int a, b=0;
	int n1=0;
	a=n1;
	int result=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the first number");
	a=in.nextInt();
	System.out.println("Enter the second number");
	b=in.nextInt();
	while (b!=0){
		if((b&1)!=0){
			result=result+a;
			
		}
		a<<=1;
		b>>=1;
	}
	System.out.println("The result is " +result);
	
	
	}
		
	
	
}
