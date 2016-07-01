package com.two95.polymorphism.ex;

public class Suzuki extends Car {

	public Suzuki() {
		super();

	}

	public Suzuki(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		super(vehicleType, engCC, seatingCapacity, makeYear);

	}

	@Override
	public void acceleration() {
		super.acceleration();
		System.out.println("Suzuki: accelearation speed of 0-100 in 6secs");
	}

	@Override
	public void brakeAndStop() {
		super.brakeAndStop();
		System.out.println("Suzuki: deccelearation speed is acceptabe");

	}

	public void registration() {
		System.out.println("Suzuki registration \nvehicleType=" + getVehicleType() + "\nengCC=" + getEngCC() + "\nseatingCapacity=" + getSeatingCapacity()
				+ "\nmakeYear=" + getMakeYear());
	}
}
