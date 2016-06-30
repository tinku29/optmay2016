package InheritancePolymorphism;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vc = new Car();
		vc.DMV();
		System.out.println("=========================");
		
		Vehicle vt = new Truck();
		vt.DMV();
		System.out.println("=========================");
		
		Car ch = new Honda();
		ch.DMV();
		ch.CarWash();
		System.out.println("=========================");
		
		Car cs = new Suzuki();
		cs.DMV();
		cs.CarWash();
		System.out.println("=========================");
		
		Car ct = new Toyota();
		ct.DMV();
		ct.CarWash();
		
		Toyota t = new Toyota();
		t.ToyotaDealer();

	}

}
