package com.two95.ch7.assignment;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle<String> v = new Vehicle<String>("l2", "Honda");
		v.register(1593);
		System.out.println(v.getMake()+" "+v.getModel());
		Vehicle<Integer> v2 = new Vehicle<Integer>(201, "Yoyota");
		v2.register("MA0923");
		System.out.println(v2.getMake()+" "+v2.getModel());

		
		
	}

}
