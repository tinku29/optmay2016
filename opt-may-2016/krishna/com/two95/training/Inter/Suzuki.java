package com.two95.training.Inter;

import java.util.Scanner;

public class Suzuki extends Cars {
	@override
	public void dmvBuy() {
		System.out.println("Please Register your new Suzuki car with dmv");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter SSN:");
		String b = ss.nextLine();
		System.out.println("Enter Your State:");
		String c = ss.nextLine();
		System.out.println("HI " + a
				+ " your New Suzuki car registration is successful you will recive your registration number soon.");
	}

	@override
	public void dmvSell() {
		System.out.println("Please Transfer your Ownership :");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter old Owner Name:");
		String a = ss.nextLine();
		System.out.println("Enter New Owner Name:");
		String b = ss.nextLine();
		System.out.println("HI " + a + " your new Suzuki car registration is successful transferred to " + b);
		ss.close();
	}

	@override
	public void dmvHistoryCheck() {
		System.out.println("Check all honda car history here");
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Car Registration Number:");
		String a = ss.nextLine();
		System.out.println("Car Reg Number with " + a + " is a Suzuki model more details will be mailed to you soon ");
		ss.close();
	}

	@override
	public void carWash() {
		System.out.println("Washes all Suzuki Cars");
	}

}
