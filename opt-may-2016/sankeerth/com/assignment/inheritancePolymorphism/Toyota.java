package com.assignment.inheritancePolymorphism;

public class Toyota extends Car{
	
	@Override
	public void dmv(){
		System.out.println("Register a Toyota!");
	}
	
	@Override
	public void carWash(){
		System.out.println("Wash a Toyota!");
	}
	
	public void toyotaDealer(){
		System.out.println("You have entered Toyota DealerShip!");
	}
}
