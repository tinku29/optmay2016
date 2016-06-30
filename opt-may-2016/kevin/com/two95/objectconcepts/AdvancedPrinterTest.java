package com.two95.objectconcepts;

public class AdvancedPrinterTest {

	public static void main(String[] args) {
		AdvancedPrinter bw=new AdvancedPrinter("Black and White");
		bw.printDocument("Test Document 1");
		AdvancedPrinter colorPrinter=new AdvancedPrinter("Color");
		colorPrinter.printDocument("Test Document 2");

	}

}
