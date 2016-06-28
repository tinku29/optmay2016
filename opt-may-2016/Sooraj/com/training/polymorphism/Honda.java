package com.training.polymorphism;

public class Honda extends Car {
	@Override
	public void name() {
		System.out.println("Honda: The name of the car is Honda");
		
	}

	@Override
	public void make() {
		System.out.println("Honda: The make of the car is 2002");
		
	}

	@Override
	public void cost() {
		System.out.println("Honda:The cost of the car is $20000");
		
	}

}
