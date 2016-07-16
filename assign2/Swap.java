package com.two95.assign.assign2;
import java.util.*;

public class Swap {
	
	static void swap(int x, int y){
		System.out.println("Before swapping "+x+" " +y);
		x = x^y; // or x = x+y;
		y = x^y; // or y = x-y;
		x = x^y; // or x = x-y;
		System.out.println("After swapping "+x+" " +y);
	}
	public static void main(String[] args){
		System.out.println("Enter the numbers to swap");
		Scanner jj = new Scanner(System.in);
		int a = jj.nextInt();
		int b = jj.nextInt();
		swap(a, b);
		
	}

}
