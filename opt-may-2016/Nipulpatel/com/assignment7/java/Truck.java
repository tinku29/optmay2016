/***************************************************************
 * @author Nipul								 date:6/28/2016 
 * project:Assignment 7
 * Scope :Create a Vehicle->Truck relationship. 
 * Scope change : none
 * class : Sub class of Vehicle
 ***************************************************************/
package com.assignment7.java;

public class Truck extends Vehicle {

	private String TruckName = "Chevrolet";
	private String TruckModel = "SILVERADO 1500";
	private String TruckEnginType = " 4.3L FlexFuel EcoTec3 V6";

	@Override
	public String toString() {
		return "Truck [TruckName=" + TruckName + ", TruckModel=" + TruckModel + ",[\n TruckEnginType=" + TruckEnginType
				+ "]";
	}

	public String getTruckName() {
		return TruckName;
	}

	public void setTruckName(String truckName) {
		TruckName = truckName;
	}

	public String getTruckModel() {
		return TruckModel;
	}

	public void setTruckModel(String truckModel) {
		TruckModel = truckModel;
	}

	public String getTruckEnginType() {
		return TruckEnginType;
	}

	public void setTruckEnginType(String truckEnginType) {
		TruckEnginType = truckEnginType;
	}

	Truck() {
		System.out.println("This is a Truck");

	}

}
