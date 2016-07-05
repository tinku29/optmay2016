package com.two95.polymorphism.ex;

public class Truck extends Vehicle {
	@Override
	public void ignition() {
		super.ignition();
	}

	public Truck() {
		super();
	}

	public Truck(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		super(vehicleType, engCC, seatingCapacity, makeYear);

	}

	public void registration() {
		System.out.println("The truck is registered with the following details");
		System.out.println("truck registration \nvehicleType=" + getVehicleType() + "\nengCC=" + getEngCC() + "\nseatingCapacity=" + getSeatingCapacity()
				+ "\nmakeYear=" + getMakeYear());
	}

	@Override
	public void acceleration() {
		System.out.println("Truck: gaining speed");

	}

	@Override
	public void brakeAndStop() {
		System.out.println("Truck: dropping speed....and stopped");

	}

	// if later a truck dealer comes in
	public void sell() {
		System.out.println("Truck:The truck is sold");
	}

}
