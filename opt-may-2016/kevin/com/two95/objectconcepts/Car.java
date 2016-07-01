package com.two95.objectconcepts;

public abstract class Car {
	
	public abstract void assembleTyres();
	public abstract void addCover();
	public abstract void addEngine();
	public abstract void addSeats();
	public abstract void startCar();
	public abstract void shiftGears();
	public abstract void drive();
	public void testDrive(){
		assembleTyres();
		addCover();
		addEngine();
		addSeats();
		startCar();
		shiftGears();
		drive();
	}

}
