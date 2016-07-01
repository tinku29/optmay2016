package com.github.encapsulation;

public class StudentClass {

	private String sName;
	private String uniName;
	private String location;
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
		
	public String toString(){
		return "\n The Student Name is " + sName +"\n The university name is " + uniName + "\n University Location is " + location;				
	}
	
	
	
	 
}
