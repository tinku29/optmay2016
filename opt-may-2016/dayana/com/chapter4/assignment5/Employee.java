package com.chapter4.assignment5;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeId;
	private String salary;
	private String designation;
	
	
	
	public Employee(String firstName, String lastName, int employeeId, String salary, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String getEmployeeProfile()
	{
		return "[ First Name :" + this.firstName + "Last Name :" + this.lastName + "Employee Id :" + this.employeeId + "Salary :" + this.salary+ "Role :" + this.designation +"]";
	}
	
	public abstract void jobDescription();
	public abstract void accessToCode();
	
}
