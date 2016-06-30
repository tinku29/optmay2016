package com.two95.polymorphism.ex;

public class Toyota extends Car {

	public Toyota() {
		super();

	}

	public Toyota(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		super(vehicleType, engCC, seatingCapacity, makeYear);

	}

	@Override
	public void acceleration() {
		super.acceleration();

		System.out.println("Toyotta: accelearation speed of 0-100 in 6secs");
	}

	@Override
	public void brakeAndStop() {
		super.brakeAndStop();
		System.out.println("Toyotta: deccelearation speed is acceptabe. The car stopped");

	}

	public void sell() {
		System.out.println("Toyota: car sold");
	}

	public void registration() {
		System.out.println("toyota registration \nvehicleType=" + vehicleType + "\nengCC=" + engCC
				+ "\nseatingCapacity=" + seatingCapacity + "\nmakeYear=" + makeYear);

	}

}
