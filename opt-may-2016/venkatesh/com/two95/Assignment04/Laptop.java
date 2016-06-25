package com.two95.Assignment04;

public class Laptop extends Computer {

	private int screenSize;

	public Laptop()
	{
		super();
	}
	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}


	@Override
	public String toString() {
		System.out.println(super.toString());
		
		return "Laptop [screenSize=" + screenSize + "]";
	}
	public Laptop(String company, String model, String color, OperatingSystem operatingSystem, int screenSize) {
		super(company, model, color, operatingSystem);
		this.screenSize = screenSize;
	}
	@Override
	public void welcomeScreen() {
		// TODO Auto-generated method stub
		super.welcomeScreen();
		System.out.println("Turn on laptop");
	}

	
	
	
	
}
