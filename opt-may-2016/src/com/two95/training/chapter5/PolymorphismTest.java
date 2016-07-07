package com.two95.training.chapter5;

import com.two95.objectconcepts.Parent;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		Child p = new Child();
		p.pray();
	}
	//tight coupling
	public static void goToParty(GrandChild gc) {
		gc.dance();
	}

}
