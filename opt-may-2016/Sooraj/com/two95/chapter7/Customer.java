package com.two95.chapter7;

public class Customer {
	String firstName;
	String lastName;
	String ssn;
	public Customer(String firstName, String lastName, String ssn) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.ssn = ssn;
	}
	public String getFirstName() {
	return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getSsn() {
	return this.ssn;
	}
	}


