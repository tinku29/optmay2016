package com.two95.training.chapter4;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		if(c.getCarModelName().equals("Honda")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
