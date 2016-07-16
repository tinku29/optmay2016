package com.sharanya.training.Polymorphism;

import com.sharanya.training.Suzuki;

public class RefrentialPolyTest {
	
	public static void  carWashst(Car c)
	{
		c.wash();
		System.out.println("================");
	}

	public static void  vehicleRegistration(Vehicle V)
	{
		V.registration();
		System.out.println("================");
	}
	

	public static void main(String[] args) {
		//Car car= new Car();
		carWashst(new Honda());
		vehicleRegistration(new Suzuki());
		 Toyoto Cardealer= new Toyoto();
		 Cardealer.sell();
		 
		
		

	/*	
		Car car= new Car();
		
		car=new Honda();
		car.wash();
		System.out.println("=============================");
		
		car=new Toyoto();
		car.wash();
		System.out.println("=============================");
		
		
		car=new Suzuki();
		car.wash();
		System.out.println("=============================");
		
		
		Vehicle vh= new Vehicle();
		vh.registration();
		System.out.println("=============================");
		
		vh=new Car();
		vh.registration();
		System.out.println("=============================");
		
		vh= new Honda();
		vh.registration();
		System.out.println("=============================");
		vh=new Suzuki();
		vh.registration();
		System.out.println("=============================");
		vh=new Toyoto();
		vh.registration();
		
		System.out.println("=============================");
		vh=new Truck();
		vh.registration();
		
		System.out.println("=============================");
		Toyoto toyotoDealer=new Toyoto();
		toyotoDealer.sell();
		*/
		
		
		

		

	}

}
