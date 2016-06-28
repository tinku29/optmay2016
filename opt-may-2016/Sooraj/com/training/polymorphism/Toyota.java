package com.training.polymorphism;

public class Toyota extends Car {
	
	@Override
	public void name() {
		System.out.println("Toyota: The name of the car is toyota");
		
	}

	@Override
	public void make() {
		System.out.println("Toyota: The make of the car is 2000");
		
	}

	@Override
	public void cost() {
		System.out.println("Toyota:The cost of the car is $28000");
		
	}
}
