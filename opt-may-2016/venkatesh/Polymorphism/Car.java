package Polymorphism;

public class Car extends Vehicle {

	@Override
	public void wash() {
		System.out.println("washes cars");
	}

	@Override
	public void register() {

		System.out.println("register any car");
	}

	@Override
	public void sell() {
		System.out.println("sell cars");
	}

}
