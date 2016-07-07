package com.two95.training.chapter5;

public class InterfacePolymorphism {

	public static void main(String[] args) {
		
		OldGeneration oldPerson = new Person();
		
		oldPerson.retire();
		
		CurrentGeneration person = new Person();
		
		NewGeneration youngster = new Person();
		
		Person p = new Person();
		p.retire();
		p.chillOut();
		p.work();

	}

}
