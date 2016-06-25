package com.two95.assignment4;

public class Bike extends Vehicle {
	private String model;

	public Bike(String name, String colour, boolean seatBelt, int enginePower, double milage,String model) {
		super(name, colour, seatBelt, enginePower, milage);
		this.model=model;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String toString(){
		return super.toString()+" Model: "+model;
	}


}
