package com.two95.Assignment03;

public class Car {

	private String color;

	private String company;

	private String model;

	private String engineType;

	private int horsePower;

	private int milesPerGallon;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getMilesPerGallon() {
		return milesPerGallon;
	}

	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

	public Car(String color, String company, String model, String engineType, int horsePower, int milesPerGallon) {
		super();
		this.color = color;
		this.company = company;
		this.model = model;
		this.engineType = engineType;
		this.horsePower = horsePower;
		this.milesPerGallon = milesPerGallon;
	}

	public Car() {
		super();
	}

}
