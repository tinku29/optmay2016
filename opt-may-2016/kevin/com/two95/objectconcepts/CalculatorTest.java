package com.two95.objectconcepts;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1=new  Calculator();
		c1.sum(5, 2);
		System.out.println(c1.result);
		Calculator c2=new Calculator();
		c2.multiply(3, 2);
		System.out.println(c2.result);
		c1.sum(10,10);
		System.out.println( c1.result);
		c1.multiply(5,5);
		System.out.println( c1.result);

	}

}
