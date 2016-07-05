package com.two95.objectconcepts;

public class TaxCalculatorTest {

	public static void main(String[] args) {
	TaxCalculator cal=new TaxCalculator();
	double returns=cal.getMyReturns(10300, 1600, 700, 200);
	System.out.println("My total tax returns="+returns);

	}

}
