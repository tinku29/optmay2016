package com.chapter7.assignment7;

public class GenericVehicle<Vehicle> {
	private Vehicle v;
	public void register(Vehicle v)
	{
		this.v = v;
	}
	public Vehicle displayVehicle()
	{
		return v;
	}
		
}
