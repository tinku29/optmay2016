package com.two95.BasicAssignments;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		int a=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		a=in.nextInt();
		while (a!=0  & a!=1){
		a=a-2;	
		}
		
if (a==0){
	System.out.println("Its Even");
	
}else System.out.println("Its odd");
	}

}
