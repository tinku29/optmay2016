package InheritancePolymorphism;

public class Honda extends Car{
	
	@Override
	public void DMV(){
		System.out.println("Register a Honda!");
	}
	
	@Override
	public void CarWash(){
		System.out.println("Wash a Honda!");
	}
}
