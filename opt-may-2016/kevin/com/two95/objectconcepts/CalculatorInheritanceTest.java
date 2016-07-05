package com.two95.objectconcepts;

public class CalculatorInheritanceTest {

	public static void main(String[] args) {
		BssicCalculator bc=new BssicCalculator();
	   double result=bc.sum(10, 20);
		ScientificCalculator sc=new ScientificCalculator();
		result=sc.sum(20, 30);
		 result=sc.product(20,30);
		 AdvancedCalculator ac=new AdvancedCalculator();
		result= ac.sum(10,10);
		 result=ac.product(10,10);
		result= ac.divide(10,10);
		 

	}

}
