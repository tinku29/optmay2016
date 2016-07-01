package com.two95.Assignment05;

public class Cat extends Animal implements Person{

	public void Eat() {
		// TODO Auto-generated method stub
System.out.println("cat eat rat");
	}

	
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cat sleeps");
	}


	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("cat walk");
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work is to go across street");
	}


	@Override
	public void eat() {
System.out.println("does eat");		
	}

	
	
}
