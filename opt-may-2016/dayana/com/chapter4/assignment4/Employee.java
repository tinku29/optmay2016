package com.chapter4.assignment4;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private String salary;
	private String role;
	
	public Employee() {}

	public Employee(String firstName, String lastName, int employeeId, String salary, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.role = role;
	}
	
	public String getEmployeeProfile()
	{
		return "[ First Name :" + this.firstName + "Last Name :" + this.lastName + "Employee Id :" + this.employeeId + "Salary :" + this.salary+ "Role :" + this.role +"]";
	}
	public void jobDescription()
	{
		//System.out.println("Employee is working fulltime");
	}

}
