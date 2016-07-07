package com.two95.objectconcepts;

public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	public void setFirstName(String fName){
		firstName=fName;
	}
	public void setLastName(String lName){
		lastName=lName;
	}
	public void setAddress(String add){
		address=add;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getAddress(){
		return address;
	}

}
