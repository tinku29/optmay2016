package com.training.polymorphism;

public class ToyotaDealer {
	public void implement(Vehicle T){
		System.out.println("Welcome to Toyota dealership");
		System.out.println("The cars have the following specifications");
		T.goFast();
	        T.stop();
		T.reverse();
		
	}
//
}
