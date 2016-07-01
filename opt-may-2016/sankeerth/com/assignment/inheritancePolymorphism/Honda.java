package com.assignment.inheritancePolymorphism;

public class Honda extends Car{
	
	@Override
	public void dmv(){
		System.out.println("Register a Honda!");
	}
	
	@Override
	public void carWash(){
		System.out.println("Wash a Honda!");
	}
}
