package com.two95.Assignment04;

public class Computer {
	
	private String company;
	private String model;
	private String color;
	private OperatingSystem operatingSystem;
	public Computer(String company, String model, String color, OperatingSystem operatingSystem) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Computer [company=" + company + ", model=" + model + ", color=" + color + ", operatingSystem="
				+ operatingSystem + "]";
	}
	public OperatingSystem getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Computer() {
		super();
	}
	
	public void welcomeScreen()
	{
		System.out.println("welcome "+ company+" user");
	}
	
    
}
