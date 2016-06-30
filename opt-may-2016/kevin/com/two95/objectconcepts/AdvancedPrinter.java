package com.two95.objectconcepts;

public class AdvancedPrinter {
	String printType;
	AdvancedPrinter(String type){
		printType=type;
	}
	public void printDocument(String text){
		System.out.println(text+" printed in "+printType);
	}

}
