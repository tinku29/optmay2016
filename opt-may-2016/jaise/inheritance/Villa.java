package com.two95.chapter4.inheritance;

public class Villa extends IndividualHouse {
private int floors;

public Villa() {
	super();
	
}

public Villa(int members, int rooms, double sft, Address address, int numGates, int floors) {
	super(members, rooms, sft, address, numGates);
	
}

public int getFloors() {
	return floors;
}

public void setFloors(int floors) {
	this.floors = floors;
}
public double computeTax(double rate, double sft){
	
	System.out.println("Villas tax computation");
	return super.computeTax(rate, sft);
}

@Override
public String toString() {
	return super.toString()+"Villa [floors=" + floors + "]";
}

}
