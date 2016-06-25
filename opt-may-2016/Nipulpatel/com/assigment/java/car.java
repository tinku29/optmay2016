
package com.assigment.java;

public class car {

	private String carName = "";
	private String Model = "";
	private String enginType = "";

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getEnginType() {
		return enginType;
	}

	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}

	public String getCarinfo() {
		return (carName);
	}

	car() {

		carName = "car name is honda";
		Model = "model name is CRV";
		enginType = "Engine type is turbo";
	}

}
