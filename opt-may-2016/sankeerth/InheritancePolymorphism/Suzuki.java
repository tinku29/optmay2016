package InheritancePolymorphism;

public class Suzuki extends Car{
	
	@Override
	public void DMV(){
		System.out.println("Register a Suzuki!");
	}
	
	@Override
	public void CarWash(){
		System.out.println("Wash a Suzuki!");
	}
	
}
