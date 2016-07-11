package com.chapter7.assignment7;

public class GenericVehicleTest {
	public static void main(String[] args)
	{
		GenericVehicle<Vehicle> v = new GenericVehicle<Vehicle>();
		v.register(new Vehicle(2012,"Honda Civic"));
		Vehicle vehicle = v.displayVehicle();
		System.out.println("Make and model of the vehicle is "+vehicle.getMake() +" "+ vehicle.getModel());
	}

}
