package com.two95.polymorphism.ex;

public class PolymorphismTest {

	public static void main(String[] args) {
		Toyota k = new Toyota("car", 1000, 5, 2016);
		Car civ = new Honda("Car", 1198,5,2016);
		ToyotaDealer m = new ToyotaDealer();
		// selling toyota
		m.sell(k);
		System.out.println("\n............................\n");
		Dmv d = new Dmv();
		d.registration(k);
		System.out.println("\n............................\n");
		CarWash cw = new CarWash();
		cw.carwash(k);
		System.out.println("\n............................\n");
		//  suzuki registration and carwash
		Car cSuz = new Suzuki("car", 1100, 5, 2016);
		d.registration(cSuz);
		System.out.println("\n............................\n");
		cw.carwash(cSuz);
		System.out.println("\n............................\n");
		//truck
		Truck tr = new Truck("truck",1800,4,2007);
		d.registration(tr);
		System.out.println("\n............................\n");
		// Honda registration and car wash
		d.registration(civ);
		System.out.println("\n............................\n");
		cw.carwash(civ);

	}

}
