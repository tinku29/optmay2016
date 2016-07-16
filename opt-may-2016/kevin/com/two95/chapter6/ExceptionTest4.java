package com.two95.chapter6;

public class ExceptionTest4 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.divide(10, 2); 
		calc.divide(10, 0);

	}

}
