package Polymorphism;

public class Suzuki extends Car {

	@Override
	public void wash() {
		
		System.out.println("washes suzuki cars");
	}

	@Override
	public void register() {
		
		System.out.println("registers a suzuki");

	}

	@Override
	public void sell() {
		
		System.out.println("sells suzuki");

	}

}
