package com.two95.training.Inter;

import java.util.Scanner;

public class Toyota extends Cars {
	@Override
	public void dmvBuy() {
		System.out.println("Please Register your new Toyota car with dmv");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter SSN:");
		String b = ss.nextLine();
		System.out.println("Enter Your State:");
		String c = ss.nextLine();
		System.out.println("HI " + a
				+ " your new Toyota car registration is successful you will recive your registration number soon.");
	}

	@Override
	public void dmvSell() {
		System.out.println("Please Transfer your Ownership :");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter old Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter New Owner Name:");
		String b = ss.nextLine();
		System.out.println("HI " + a + " your new Toyota car registration is successful transferred to " + b);
	}

	@Override
	public void dmvHistoryCheck() {
		System.out.println("Check all Toyota car history here");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Car Registration Number:");
		String a = ss.nextLine();
		System.out.println("Car Reg Number with " + a + " is a Toyota model more details will be mailed to you soon ");
	}

	@Override
	public void carWash() {
		System.out.println("Washes all Toyota Cars");
	}

	public void sellToyota() {
		System.out.println("Sell only Toyota Cars");
	}

}
