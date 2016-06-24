package com.two95.BasicAssignments;
import java.util.Scanner;
public class DaysOfMonth {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		

		 int month = 0;
	        int year = 0;
	        int numDays = 0;
	        System.out.println("Enter the month");
	        month=in.nextInt();
	        System.out.println("Enter the year");
	        year=in.nextInt();

	        switch (month) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                numDays = 31;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                numDays = 30;
	                break;
	            case 2:
	                if (((year % 4 == 0) && 
	                     !(year % 100 == 0))
	                     || (year % 400 == 0))
	                    numDays = 29;
	                else
	                    numDays = 28;
	                break;
	            default:
	                System.out.println("Invalid month.");
	                break;
	        }
	        System.out.println("Number of Days = "
	                           + numDays);
	    }}
