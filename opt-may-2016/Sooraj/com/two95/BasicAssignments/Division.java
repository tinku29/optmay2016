package com.two95.BasicAssignments;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
    int a, b, count=0;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the two numbers to be divided");
    a=in.nextInt();
    b=in.nextInt();
    if (a<0){
    	a=-a;
    }
    if (b<0){
    	b=-b;
    }
    while (a>0){
    	a=a-b;
    	count++;
    }
    System.out.println("The answer is " +count);
	}

}
