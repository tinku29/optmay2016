package com.two95.polymorphism.ex;

public class Honda extends Car {
	
	public Honda() {
		super();
		
	}

	public Honda(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		super(vehicleType, engCC, seatingCapacity, makeYear);
		
	}

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
		super.registration();
		System.out.println("Honda registration \nvehicleType=" + getVehicleType() + "\nengCC=" + getEngCC()
				+ "\nseatingCapacity=" + getSeatingCapacity() + "\nmakeYear=" + getMakeYear());
	}

}
