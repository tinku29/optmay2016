package Polymorphism;

public class Test {

	public static void main(String[] args) {
		CarwashShop cs = new CarwashShop();
		cs.carWash(new Toyota());
		cs.carWash(new Honda());
		cs.carWash(new Suzuki());

		System.out.println("--------------------------");

		ToyotaDealer td = new ToyotaDealer();
		td.sell(new Toyota());
		// In future if we want to sell others cars we need to just change the
		// parameter type of sell method in ToyyotaDealer to Car type

		System.out.println("--------------------------");

		DMV d = new DMV();
		d.register(new Vehicle());// Can register any other vehicles say two
									// wheelers easily in future
		d.register(new Car()); // Can register any other cars say Mercedes
								// easily in future
		d.register(new Toyota());
		d.register(new Honda());
		d.register(new Suzuki());
		d.register(new Truck());
	}

}
