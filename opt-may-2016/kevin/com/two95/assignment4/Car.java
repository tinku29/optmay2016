package com.two95.assignment4;

public class Car extends Vehicle {
	private int doorNo;
	private String tyreManufacturer;
	private String model;
	public Car(String name, String colour, boolean seatBelt,int enginePower, double milage, int doorNo, String tyreManufacturer,String model) {
		super(name, colour,seatBelt, enginePower, milage);
		this.doorNo = doorNo;
		this.tyreManufacturer = tyreManufacturer;
		this.model=model;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getTyreManufacturer() {
		return tyreManufacturer;
	}
	public void setTyreManufacturer(String tyreManufacturer) {
		this.tyreManufacturer = tyreManufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String toString(){
		
		return  super.toString()+" Door numbers:"+this.doorNo+" Tyre Manufacturer: "+this.tyreManufacturer; 
	}

}
