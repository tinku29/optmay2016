package com.training.polymorphism;

public class ToyotaDealer {
	public void sellingCars(Vehicle toyotaCar){
		System.out.println("Welcome to Toyota dealership");
		System.out.println("The cars have the following specifications");
		toyotaCar.goFast();
	        toyotaCar.stop();
		toyotaCar.reverse();
		
	}
//
}
