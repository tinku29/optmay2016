package com.assignment.inheritancePolymorphism;

public class Car extends Vehicle{
	
	@Override
	public void dmv(){
		System.out.println("Register a Car!");
	}
	
	public void carWash(){
		System.out.println("Wash a Car!");
	}

}
