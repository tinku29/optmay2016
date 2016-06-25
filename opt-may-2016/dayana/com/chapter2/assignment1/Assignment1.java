package com.chapter2.assignment1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		voteEligibility();
		printGrade();

	}
	
	static void voteEligibility() throws NoSuchElementException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		String ageInput = null;
		try{
			if(!(ageInput = sc.nextLine()).isEmpty())
			{
				int age = Integer.parseInt(ageInput);
				if (age<18)
				{
					System.out.println(" Sorry ! You are not eliigble to vote \n");
				}
				else
				{
					System.out.println("Congrats! You are eligible to vote \n");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(" Sorry ! You didnot enter a valid age \n");
		}
		sc.nextLine();
		sc.close();	
	}
	static void printGrade() throws NoSuchElementException
	{
		System.out.println("Enter the marks");		
		String marksInput =  null;
		Scanner sc1 = new Scanner(System.in);
		try
		{
			if(!(marksInput = sc1.nextLine()).isEmpty())
			{
				int marks = Integer.parseInt(marksInput);
				if(marks <0 || marks>100)
					System.out.println("Invalid Marks entered ! Enter your marks");
				else if(marks>=0 && marks<=34)
					System.out.println("FAIL");
				else if(marks>=35 && marks<=49)
					System.out.println("Grade C");
				else if(marks>=50 && marks<=59)
					System.out.println("Grade B");
				else if(marks>=60 && marks<=79)
					System.out.println("Grade A");
				else if(marks>=80 && marks<=100)
					System.out.println("Grade A");
			}	
		}
		catch(Exception e)
		{
			System.out.println(" Sorry ! You didnot enter valid marks");
		}
		sc1.close();
	}

}
