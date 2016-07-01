package com.two95.polymorphism.ex;

public class Car extends Vehicle {
	
	
	public Car() {
		super();
		
	}

	public Car(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		super(vehicleType, engCC, seatingCapacity, makeYear);
		
	}

	@Override
	public void ignition() {
		super.ignition();
	}

	@Override
	public void acceleration() {
		System.out.println("Car: gaining speed");
		
	}

	@Override
	public void brakeAndStop() {
		System.out.println("Car: dropping speed....and stopped");
		
	}
	
	public void sell(){
		System.out.println("car:The car is sold");
	}
	
	

}
