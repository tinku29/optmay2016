/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :practice Book examples
 * Scope change : none
 * class : Main class
 ***************************************************************/


package com.assignment.chapter7.java;

public class StudentName {

	public  String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	String firstName;
	static String Email;
	

	public StudentName(String firstName, String Email) {
		this.firstName = firstName;
		this.Email = Email;
		
	}

	public  String getFirstName() {
		return this.firstName;
	}


	
	

}
