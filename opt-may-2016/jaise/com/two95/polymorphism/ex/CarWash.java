package com.two95.polymorphism.ex;

public class CarWash {
	public void carwash(Car n){
		System.out.println("Entering the car wash area");
		n.ignition();
		n.acceleration();
		n.brakeAndStop();
		System.out.println("The car wash is complete");
	}

}
