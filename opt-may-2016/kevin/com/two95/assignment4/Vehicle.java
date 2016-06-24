package com.two95.assignment4;

public class Vehicle {
	private String name;
	private String colour;
	private boolean seatBelt;
	private int enginePower;
	private double milage;
	public Vehicle(){
		
	}
	public Vehicle(String name, String colour, boolean seatBelt, int enginePower,double milage) {
		super();
		this.name = name;
		this.colour = colour;
		this.seatBelt = seatBelt;
		this.enginePower = enginePower;
		this.milage=milage;
	}
	public void calcualteMilage(){
		System.out.println("Milage="+this.milage);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isSeatBelt() {
		return seatBelt;
	}
	public void setSeatBelt(boolean seatBelt) {
		this.seatBelt = seatBelt;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	public String toString(){
	return "Name: " +this.name+" Colour: "+this.colour+"Seat belt: "+this.seatBelt+" Engine Power: "+this.enginePower+" Milage: "+this.milage;
	}
	
}
	