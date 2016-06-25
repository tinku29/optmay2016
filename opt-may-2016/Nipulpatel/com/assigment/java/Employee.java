package com.assigment.java;

public class Employee {

	private String name = "";

	public int EmployeeNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	Employee() {
		name = "nipul";
		System.out.println("Employee name is " + name);
	}

	Employee(int EmployeeNumber) {
		EmployeeNumber = 777;
		System.out.println("Employee number is " + EmployeeNumber);
	}

}
