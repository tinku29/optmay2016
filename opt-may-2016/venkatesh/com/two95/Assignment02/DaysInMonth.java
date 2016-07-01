package com.two95.Assignment02;
import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month");

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

			break;
		case "April":
		case "June":
		case "September":
		case "November":
			days=30;
			System.out.println(days);
		default:
			System.out.println("invalid month");
		

			break;

		}
	

	}

}
