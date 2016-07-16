package com.two95.assign.assign2;
import java.util.*;

public class Division {
static void division(int a , int b){
	double l = 0;
	l = a* Math.pow(b , -1);
	System.out.println("The division of "+a+"," +b+" yields" +l);
	
}
	public static void main(String[] args) {
		System.out.println("Enter the numbers to divide");
		Scanner op = new Scanner(System.in);
		int j = op.nextInt();
		int k = op.nextInt();
		division(j , k);
	}

}
