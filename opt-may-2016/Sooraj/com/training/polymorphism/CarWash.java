package com.training.polymorphism;

public class CarWash {
	public void wash1(Car c) {
		System.out.println("Starting the wash process in first come first serve manner");
		
		c.goFast();
		c.stop();
		c.reverse();
		
		System.out.println("The wash is done and payment can be done at the counter");
	}
//
	

}
