package com.two95.Assignment04;

public class OperatingSystem {

	private String primaryOperatingSystem;
	private String secondaryOperatingSystem;
	public String getPrimaryOperatingSystem() {
		return primaryOperatingSystem;
	}
	public void setPrimaryOperatingSystem(String primaryOperatingSystem) {
		this.primaryOperatingSystem = primaryOperatingSystem;
	}
	public String getSecondaryOperatingSystem() {
		return secondaryOperatingSystem;
	}
	public void setSecondaryOperatingSystem(String secondaryOperatingSystem) {
		this.secondaryOperatingSystem = secondaryOperatingSystem;
	}
	public OperatingSystem(String primaryOperatingSystem, String secondaryOperatingSystem) {
		super();
		this.primaryOperatingSystem = primaryOperatingSystem;
		this.secondaryOperatingSystem = secondaryOperatingSystem;
	}
	public OperatingSystem() {
		super();
	}
	@Override
	public String toString() {
		return "OperatingSystem [primaryOperatingSystem=" + primaryOperatingSystem + ", secondaryOperatingSystem="
				+ secondaryOperatingSystem + "]";
	}
	
	
	
}
