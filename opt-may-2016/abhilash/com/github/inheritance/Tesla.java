package com.github.inheritance;

public class Tesla extends Car{
	
	Tesla(){
		super("Tesla",45,60000);
	}

	public static void main(String[] args) {
 
		Tesla t = new Tesla();
		t.printDetails();
		t.bodyType("suv");
		t.fuel("Electric Battery "); 
		
	}

}
