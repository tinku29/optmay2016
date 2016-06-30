package com.two95.assignment5;

public abstract class Car {
	private String name;
	private String colour;
	private int enginePower;
	private double milage;
	public abstract void designEngine();
	public abstract void designDoor();
	public void startCar(){
		System.out.println("Start the car");
	}
	public void driveCar(){
		System.out.println("Drive the car");
	}
	public void stopCar(){
		System.out.println("Stop the car");
	}
	

}
