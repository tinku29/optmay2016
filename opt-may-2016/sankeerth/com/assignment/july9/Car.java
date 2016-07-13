package com.assignment.july9;

import java.util.Random;
import java.util.Scanner;

public class Car<C> {
	/*
	 * Car class accepts any type of vehicles and registers them, prints the
	 * make & model of the Vehicle.
	 */

	private C vehicle;

	public void register(C vehicle) {
		this.vehicle = vehicle;
	}

	public C get() {
		return vehicle;
	}

	public static void main(String[] args) {

		Car<String> make = new Car<String>();
		Car<String> model = new Car<String>();
		Car<Integer> cost = new Car<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Vehicle make: ");
		String x1 = sc.nextLine();
		make.register(x1);
		System.out.println("Enter you vehicle model: ");
		String x2 = sc.nextLine();
		model.register(x2);
		System.out.println("Enter the cost of your vehicle: ");
		int x3 = sc.nextInt();
		cost.register(x3);
		Random rand = new Random();
		int registrationNumber = rand.nextInt(9999) + 1;
		System.out.println(
				"Your vehicle is " + make.get() + " of the model " + model.get() + ". \nWith a Final Cost Price of "
						+ cost.get() + ". \nYour registered number is: TS 10 AF " + registrationNumber);
		sc.close();

	}

}
