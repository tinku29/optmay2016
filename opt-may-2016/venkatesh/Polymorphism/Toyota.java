package Polymorphism;

public class Toyota extends Car {

	@Override
	public void wash() {
		System.out.println("washes toyota cars");
	}

	@Override
	public void sell() {
		System.out.println("sells toyota");

	}

	@Override
	public void register() {
		System.out.println("registers a Toyota car");

	}

}
