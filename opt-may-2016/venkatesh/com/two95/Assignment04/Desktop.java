package com.two95.Assignment04;

public class Desktop extends Computer {

	private String UpsName;

	public String getUpsName() {
		return UpsName;
	}

	public Desktop() {

	}

	public void setUpsName(String upsName) {

		UpsName = upsName;
	}

	



	@Override
	public String toString() {
		//System.out.println(super.toString());
		
		return super.toString()+"Desktop [UpsName=" + UpsName +"]";
	}

	public Desktop(String company, String model, String color, OperatingSystem operatingSystem, String upsName) {
		super(company, model, color, operatingSystem);
		UpsName = upsName;
	}

	@Override
	public void welcomeScreen() {
		super.welcomeScreen();

		System.out.println("log on desktop!");
	}

}
