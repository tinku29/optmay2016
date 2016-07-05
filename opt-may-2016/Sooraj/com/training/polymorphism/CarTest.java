package com.training.polymorphism;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("Dealer of Toyota");
		ToyotaDealer obj =new ToyotaDealer();
		obj.sellingCars(new Toyota());
		System.out.println("------------------------");
		System.out.println("Entering the carwash");
		//
		CarWash c1=new CarWash();
		c1.wash1(new Toyota());
		CarWash c2=new CarWash();
		c2.wash1(new Suzuki());
		CarWash c3=new CarWash();
		c3.wash1(new Honda());
		System.out.println("Exiting the car wash");
		System.out.println("---------------------------");
		
		System.out.println("Entering DMV");
		DMV d=new DMV();
		d.registerVehicles(new Truck());
		DMV d1=new DMV();
		d1.registerVehicles(new Toyota());
		DMV d2 =new DMV();
		d2.registerVehicles(new Suzuki());
		DMV d3 =new DMV();
		d3.registerVehicles(new Honda());
		
		
		
		System.out.println("Exiting DMV");
		
		

	}

}
