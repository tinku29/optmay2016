package com.two95.BasicAssignments;
import java.util.Scanner;
public class Armstrong {
// to find whether the number is armstrong or not
	
	public static void main(String[] args) {
		int no, temp=0, n, sum, c=0;
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		no=in.nextInt();
		temp=no;
		while (no>0){
			n=no%10;
			no=no/10;
			c=c+(n*n*n);
			
		}
		if (temp==c){
			System.out.println("it's armstrong");
			
		}else {
			System.out.println("Not an armstrong");
		}

	}

}
