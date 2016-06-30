package InheritancePolymorphism;

public class Car extends Vehicle{
	
	@Override
	public void DMV(){
		System.out.println("Register a Car!");
	}
	
	public void CarWash(){
		System.out.println("Wash a Car!");
	}

}
