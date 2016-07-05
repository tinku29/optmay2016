package com.two95.polymorphism.ex;

public abstract class Vehicle {
	private String vehicleType;
	private int engCC;
	private int seatingCapacity;
	private int makeYear;

	public Vehicle() {
	}

	public Vehicle(String vehicleType, int engCC, int seatingCapacity, int makeYear) {
		this.vehicleType = vehicleType;
		this.engCC = engCC;
		this.seatingCapacity = seatingCapacity;
		this.makeYear = makeYear;
	}
	


	// methods
	public void ignition() {
		System.out.println("The  vehicle engine has started");
	}

	public abstract void acceleration();

	public abstract void brakeAndStop();

	public void registration() {
		System.out.println("The vehicle is registered with the following details");
		
	}

	public void sell() {
		System.out.println("Sold the vehicle");
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getEngCC() {
		return engCC;
	}

	public void setEngCC(int engCC) {
		this.engCC = engCC;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}



	// toString
	@Override
	public String toString() {
		return "Vehicle details\nvehicleType=" + getVehicleType() + "\nengCC=" + getEngCC() + "\nseatingCapacity=" + getSeatingCapacity()
				+ "\nmakeYear=" + getMakeYear();
	}

}
