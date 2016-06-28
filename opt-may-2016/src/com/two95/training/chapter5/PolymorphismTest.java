package com.two95.training.chapter5;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.pray();
		p.sing();
		p.work();
	}
	//tight coupling
	public static void goToParty(GrandChild gc) {
		gc.dance();
	}
	//loosely coupled
	public static void goToTemple(Parent p) {
		p.pray();
	}

}
