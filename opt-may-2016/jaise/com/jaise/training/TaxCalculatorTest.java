package com.jaise.training;

public class TaxCalculatorTest {

	public static void main(String args[]) {      
			 TaxCalculator calc = new TaxCalculator();     
			 // Pass the details, and take the essentials     
			 double returns = calc.getMyReturns(10300, 1600, 700,200);      
			 System.out.println("My total tax returns = " + returns);   }
}