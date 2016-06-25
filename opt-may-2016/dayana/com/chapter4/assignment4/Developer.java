package com.chapter4.assignment4;

public class Developer extends Employee {
	
	private String technology;
	public Developer() {
		super();
	
	}
	public Developer(String firstName, String lastName, int employeeId, String salary, String role, String technology) {
		super(firstName, lastName, employeeId, salary, role);
		this.technology = technology;
	}
	
	public void jobDescription()
	{
		System.out.println(" Developer designs and code and develops the software in" + this.technology);
	}
	public  void accessToCode()
	{
		System.out.println("Developer has access to code in" + this.technology);
	}

}
