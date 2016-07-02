package com.chapter2.assignment6;

public class Test {
	
	public static void main(String[] args) {
		CarWash w=new CarWash();
		w.wash(new Honda());
		w.wash(new Toyota());
		w.wash(new Suzuki());
		DMV dmv=new DMV();
		dmv.register(new Vehicle());
		dmv.register(new Car());
		dmv.register(new Toyota());
		dmv.register(new Honda());
		dmv.register(new Suzuki());
		dmv.register(new Truck());
		ToyotaDealer dealer=new ToyotaDealer();
		dealer.sell(new Toyota());
	}

}
