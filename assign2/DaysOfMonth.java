package com.two95.assign.assign2;

import java.util.*;

public class DaysOfMonth {

	public static void main(String[] args) {
		int cas = 0;
		String[] month = new String[12];
		month[0] = "January";
		month[1] = "February";
		month[2] = "March";
		month[3] = "April";
		month[4] = "May";
		month[5] = "June";
		month[6] = "July";
		month[7] = "August";
		month[8] = "September";
		month[9] = "October";
		month[10] = "November";
		month[11] = "December";

		System.out.println("Enter the number");
		Scanner nu = new Scanner(System.in);
		int numb = nu.nextInt();
		switch (numb) {
		case 1:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 2:

			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 28 or 29 days depending on the year");
		case 3:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 4:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 30 days");
			break;
		case 5:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 6:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 30 days");
			break;
		case 7:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 8:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 9:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 30 days");
			break;
		case 10:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		case 11:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 30 days");
			break;
		case 12:
			System.out.println("The month is " + month[numb - 1]);
			System.out.println("The month has 31 days");
			break;
		}
	}

}
