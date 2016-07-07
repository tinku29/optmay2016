package com.assignment.inheritancePolymorphism;

public class Suzuki extends Car{
	
	@Override
	public void dmv(){
		System.out.println("Register a Suzuki!");
	}
	
	@Override
	public void carWash(){
		System.out.println("Wash a Suzuki!");
	}
	
}
