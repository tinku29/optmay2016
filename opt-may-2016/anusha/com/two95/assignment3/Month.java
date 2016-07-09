package com.two95.assignment3;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month");
         String month = input.next();
         
		int days = 0;
		switch (month) {
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			days = 31;
			System.out.println(days);
			break;
		case "Febrauary":
			days = 28;
			System.out.println(days);

	}

	}
}
