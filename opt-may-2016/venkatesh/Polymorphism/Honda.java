package Polymorphism;

public class Honda extends Car {

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("washes Honda cars");
	}

	@Override
	public void register() {
		System.out.println("registers a Honda car");

	}

	@Override
	public void sell() {
		System.out.println("sells a honda car");

	}

}
