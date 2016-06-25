/**
 * 
 */
package com.sankeerth.training;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class ArmstrongNumbers {
		// Program to check if a number is armstrong or not

	public static void main(String[] args) {
		
		//String sum;
		Scanner sc = new Scanner( System.in );
		System.out.print("Enter a  number:");
		//input process to take a number
		int input = sc.nextInt();
		int sum = 0;
		int k = input;

		while (input > 0){
			int j = input%10;
			//gets the last digit of the input
			sum = sum + (j * j * j);
			//cubes the last digit of the input
			input = input / 10;
			//divides the input by 10 thus reducing the digits
			
		}
		if(k == sum){
			System.out.println("The number " + k + " is an armstrong.");
		}
		else{
			System.out.println("The number " + k + " is not an armstrong.");
		}
		sc.close();
		}
		
	}

