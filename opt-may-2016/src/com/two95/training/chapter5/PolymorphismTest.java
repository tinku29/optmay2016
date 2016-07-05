package com.two95.training.chapter5;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		NewParent p = new Child();
		p.pray();
		p.singLoudly();
		p.renamedWork();
	}
	//tight coupling
	public static void goToParty(GrandChild gc) {
		gc.dance();
	}
	//loosely coupled
	public static void goToTemple(NewParent p) {
		p.pray();
	}

}
