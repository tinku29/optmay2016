package com.github.poly;

public class Polymorphism {

	public static void main(String[] args) {
		
		Car carr = new Car();
		carr.carwash();	
		System.out.println("===============");
		
		Car car = new Honda();
		car.carwash();
		car.dmv();
		System.out.println("===============");

		
		Toyota r = new Toyota();
		r.toDealer();
		System.out.println("===============");

		
		Car reg = new Suzuki();
		reg.dmv();
		System.out.println("===============");

		
		Vehicle regi = new Truck();
		regi.dmv();
		
		
		
		

	}

}
