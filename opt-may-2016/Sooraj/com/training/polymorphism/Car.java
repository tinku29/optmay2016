package com.training.polymorphism;

public class Car extends vehicle {

	@Override
	public void name() {
		System.out.println("Car: The name of the car");
		
	}

	@Override
	public void make() {
		System.out.println("car: The make of the car");
		
	}

	@Override
	public void cost() {
		System.out.println("car:The cost of the car");
		
	}
	
	
}
	
