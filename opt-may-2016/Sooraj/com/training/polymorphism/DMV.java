package com.training.polymorphism;

public class DMV {
	public void registerVehicles(Vehicle v){
		System.out.println("Starting the registration");
		System.out.println("---------------------------");
		v.goFast();
		v.stop();
		v.reverse();
		System.out.println("End of registration");
		System.out.println("---------------------------");
		
	}
//
}
