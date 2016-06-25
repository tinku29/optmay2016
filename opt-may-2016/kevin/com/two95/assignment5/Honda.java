package com.two95.assignment5;

public class Honda extends Car {
	public void designEngine(){
		System.out.println("Design engine called in child class");
	}
	
	@Override
	public void designDoor() {
		
		System.out.println("Door designed");
	}
	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		super.startCar();
		System.out.println("Start car called in child class");
	}
	@Override
	public void driveCar() {
		// TODO Auto-generated method stub
		super.driveCar();
		System.out.println("Drive car called in child class");
	}
	@Override
	public void stopCar() {
		// TODO Auto-generated method stub
		super.stopCar();
		System.out.println("Stop car called in child class");
	}

}
