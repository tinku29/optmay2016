package com.two95.training.chapter4;

public class Car {
	
	private String model = "Honda";
	
	public String getCarModelName() {
		//bad programming
		model =null;
		return model;
		}

}
