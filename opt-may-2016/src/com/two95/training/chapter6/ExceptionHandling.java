package com.two95.training.chapter6;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Car car1 = new Car("Honda");
		Car car2 = new Car("Toyota");
		
		try {
			checkForHonda(car1);
		} catch (HondaException e) {
			System.err.println("Car1 threw exception "+ e.getMessage());
		}
		
		try {
			checkForHonda(car2);
		} catch (HondaException e) {
			System.err.println("Car2 threw exception "+ e.getMessage());
		}
		
	}
	
	private static void checkForHonda(Car anyCar) throws HondaException {
		if(anyCar!=null) {
			
			String anyCarModel = anyCar.getModel();
			
			if("Honda".equalsIgnoreCase(anyCarModel)) {
				System.out.println("It is a Honda");
			} else {
				throw new HondaException(anyCarModel + " is not a Honda Car");
			}
		}
	}
	
	

}
