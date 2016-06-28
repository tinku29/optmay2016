package com.training.polymorphism;

public class Truck extends vehicle {

	@Override
	public void name() {
		System.out.println("Truck: The name of the truck is alt");
		
	}

	@Override
	public void make() {
		System.out.println("Truck: The make of the truck is 2010");
		
	}

	@Override
	public void cost() {
		System.out.println("Truck: The cost is $45000 ");
		
	}

	
}
