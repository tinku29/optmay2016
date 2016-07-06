package com.two95.training.Inter;

import java.util.Scanner;

public class Truck extends Vehicle {
	@Override
	public void dmvBuy() {
		System.out.println("Please Register your Truck with dmv");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter SSN:");
		String b = ss.nextLine();
		System.out.println("Enter Your State:");
		String c = ss.nextLine();
		System.out.println(
				"HI " + a + " your Truck registration is successful you will recive your registration number soon.");
	}

	@Override
	public void dmvSell() {
		System.out.println("Please Transfer your Ownership :");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter old Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter New Owner Name:");
		String b = ss.nextLine();
		System.out.println("HI " + a + " your Truck registration is successful transferred to " + b);
	}

	@Override
	public void dmvHistoryCheck() {
		System.out.println("Check Truck history here");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Car Registration Number:");
		String a = ss.nextLine();
		System.out.println("Vehicle Reg Number with " + a + " is a Truck more details will be mailed to you soon ");
	}

}
