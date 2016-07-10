/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collection (Assignment 8)
 * Scope :Sort and print the students in opt-june batch by last
 *  name, age, first name and height 
 * Scope change : none
 * class : Comparator
 ***************************************************************/

package com.assignment.chapter7.java;

public class OptStudent {

	String firstName;
	String lastName;
	int age;
	String height;

	public OptStudent(String firstName, String lastName, int age, String height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;// Height

	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {

		return this.lastName;
	}

	public int getSsn() {
		return this.age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
