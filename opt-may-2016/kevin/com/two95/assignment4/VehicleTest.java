package com.two95.assignment4;

public class VehicleTest {

	public static void main(String[] args) {
		Car c=new Car("BMW","White",true,1000,20.5,4,"GoodYear","530");
		Bike b=new Bike("Royal Enfield","Black",false,350,40,"Classic");
		c.calcualteMilage();
		System.out.println(c);
		b.calcualteMilage();
		System.out.println(b);


	}

}
