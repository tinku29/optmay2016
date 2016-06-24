package com.two95.BasicAssignments;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int a,b=0;
		int add;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the second number");
        b=in.nextInt();
        System.out.println("The sum is " +add(a,b));
	}
        public static int add(int c,int d){
        	 if(d == 0) return c;
        	 int sum = c ^ d;
        	 int carry=(c&d)<<1;
        	 return add(sum, carry);
        
	}
	
	

}
