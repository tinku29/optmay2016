package com.github.inheritance;

public class Car {
	
	private String make;
	private int milage;
	private int price;
	private Engin engNum;
	
	public Car(String make, int milage, int price){
		this.make= make;
		this.milage= milage;
		this.price= price;				
	}
	
	
	
	public Car(String make, int milage, int price, Engin engNum) {
		super();
		this.make = make;
		this.milage = milage;
		this.price = price;
		this.engNum = engNum;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Engin getEngNum() {
		return engNum;
	}
	public void setEngNum(Engin engNum) {
		this.engNum = engNum;
	}

	public void printDetails(){
		System.out.println("Company name is " + make + "\nthe milage of the car is " + milage + "\nprice of the car is " + price); 
	}
	
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", milage=" + milage + ", price=" + price + "]";
	}

	public void bodyType(String bodyType){
		System.out.println(bodyType); 
	}
	
	public void fuel(String fuelType){
		System.out.println(fuelType);
	}
	

}
