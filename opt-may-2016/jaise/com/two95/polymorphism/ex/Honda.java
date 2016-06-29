package com.two95.polymorphism.ex;

public class Honda extends Car {
	@Override
	public void acceleration() {
		super.acceleration();
		System.out.println("Honda: accelearation speed of 0-100 in 5 secs");
	}

	@Override
	public void brakeAndStop() {
		super.brakeAndStop();
		System.out.println("Honda: deccelearation speed is good");

	}

	public void registration() {
		System.out.println("Honda registration \nvehicleType=" + vehicleType + "\nengCC=" + engCC
				+ "\nseatingCapacity=" + seatingCapacity + "\nmakeYear=" + makeYear);
	}

}
