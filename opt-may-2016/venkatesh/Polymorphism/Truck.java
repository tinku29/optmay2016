package Polymorphism;

public class Truck extends Vehicle {

	@Override
	public void register() {
		System.out.println("registers a truck");
	}

	@Override
	public void wash() {
		System.out.println("washes a truck");

	}

	@Override
	public void sell() {
		System.out.println("sells a truck");

	}

}
