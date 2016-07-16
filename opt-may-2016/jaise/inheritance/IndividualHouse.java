package com.two95.chapter4.inheritance;

public class IndividualHouse extends Home {
private int numGates;

public IndividualHouse() {
	super();
}

public IndividualHouse(int members, int rooms, double sft, Address address, int numGates) {
	super(members, rooms, sft, address);
	this.numGates = numGates;
}

	public int getNumGates() {
	return numGates;
}

public void setNumGates(int numGates) {
	this.numGates = numGates;
}

	public double computeTax(double rate, double sft){
		
		return super.computeTax(rate, sft);
	}

	@Override
	public String toString() {
		return super.toString()+ "IndividualHouse [numGates=" + numGates+  "]";
	}
	
}


