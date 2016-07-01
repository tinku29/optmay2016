package com.chapter2.assignment1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Assgn1 {

	//Adding comments
	public static void main(String[] args) {
		voteEligibility();
		printGrade();
		printOddNumbers();
		printPrimeNumbers();
		printPattern();
		printMonth();
	}
	
	static void voteEligibility() throws NoSuchElementException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");		
		String ageInput = null;
		try{
			if(sc.hasNext())
				ageInput = sc.nextLine();
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
		catch (Exception e)
		{
			System.out.println(" Exception occured ! You didnot Enter a value");
		}
		sc.nextLine();
	}
	static void printGrade() throws NoSuchElementException
	{
		System.out.println("Enter the marks");
		Scanner sc1 = new Scanner(System.in);
		String marksInput = null;
		if(sc1.hasNext())			
			marksInput = sc1.nextLine();	
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
		sc1.nextLine();
	}
	static void printOddNumbers() 
	{
		System.out.println("Odd Numbers \n 1");
		for(int i = 2; i<=100 ; i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i+ "\n");
			}
		}
	}
	static void printPrimeNumbers()
	{
		System.out.println("Prime Numbers \n2\n");
		int count = 0;
		for(int i =3 ; i<=100 ; i++)
		{
			boolean prime = true;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
				{
					prime = false;
					break;
				}
			}
			if(prime == true)
			{
				System.out.println(i+"\n");
				count++;
			}
		}
		count = count+1;
		System.out.println("No of Prime numbers between 1 and 100 : "+ count);
	}
	
	static void printPattern()
	{
		for(int i =1; i<=5 ; i++)
		{
			System.out.println("\n");
			for(int j=1; j<=i ; j++)
			{
				System.out.print(j+"\t");
			}
		
		}
		System.out.println("\n");
	}
	static void printMonth()
	{
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 12");
		int number = sc2.nextInt();
		if(number == 1)
			System.out.println("January");
		else if(number ==2)
			System.out.println("February");
		else if(number ==3)
			System.out.println("March");
		else if(number ==4)
			System.out.println("April");
		else if(number ==5)
			System.out.println("May");
		else if(number ==6)
			System.out.println("June");
		else if(number ==7)
			System.out.println("July");
		else if(number ==8)
			System.out.println("August");
		else if(number ==9)
			System.out.println("September");
		else if(number ==10)
			System.out.println("October");
		else if(number ==11)
			System.out.println("November");
		else if(number ==12)
			System.out.println("December");
		else
			System.out.println("Invalid number");
	}
}
