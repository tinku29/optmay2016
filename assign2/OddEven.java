package com.two95.assign.assign2;
import java.util.*;
public class OddEven {
	static void oddEven(int inp){
		int mask = 1;
		if((inp & mask) ==1){
			System.out.println("Odd number");
			
		}else
			System.out.println("Even Number");
	}
	public static void main(String[] args){
		
		System.out.println("Enter the number");
		Scanner nu = new Scanner(System.in);
		int numb = nu.nextInt();
		oddEven(numb);
	
	}

}
