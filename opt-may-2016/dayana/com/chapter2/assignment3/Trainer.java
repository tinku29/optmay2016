package com.chapter2.assignment3;

public class Trainer {
	private String firstName;
	private String lastName;
	private double salary;
	private String technology;
	public Trainer(String firstName, String lastName, double salary, String technology) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.technology = technology;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
