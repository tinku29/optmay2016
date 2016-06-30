package InheritancePolymorphism;

public class Toyota extends Car{
	
	@Override
	public void DMV(){
		System.out.println("Register a Toyota!");
	}
	
	@Override
	public void CarWash(){
		System.out.println("Wash a Toyota!");
	}
	
	public void ToyotaDealer(){
		System.out.println("You have entered Toyota DealerShip!");
	}
}
