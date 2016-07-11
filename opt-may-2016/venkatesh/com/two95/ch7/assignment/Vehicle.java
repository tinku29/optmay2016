package com.two95.ch7.assignment;

public class Vehicle<T> {
	
	private T model;
	private String make;
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Vehicle(T model, String make) {
		super();
		this.model = model;
		this.make = make;
	}
	public Vehicle() {
		super();
	}
	public <T> void  register(T vehicleNumber)
	{
		System.out.println("vehicle with number "+vehicleNumber+"is registered");
	}
	

}
