package com.two95.chapter2.assignment1;

import java.util.*;

public class Month {

	public static void main(String[] args) {
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
		System.out.print("The month is " + month[numb - 1]);
	}

}
