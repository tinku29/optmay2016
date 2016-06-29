package com.two95.assignment6;

public class VehicleTest {

	public static void main(String[] args) {
		
		
		
		CarWorkshop w=new CarWorkshop();
		String honda=w.CarWash(new Honda());
		System.out.println(honda);
		String toyota=w.CarWash(new Toyota());
		System.out.println(toyota);
		String suzuki=w.CarWash(new Suzuki());
		System.out.println(suzuki);
		DMV d=new DMV();
		d.register(new Vehicle());
		d.register(new Car());
		d.register(new Toyota());
		d.register(new Honda());
		d.register(new Suzuki());
		d.register(new Truck());
		ToyotaDealer td=new ToyotaDealer();
		td.sell(new Toyota());
	

	}

}
