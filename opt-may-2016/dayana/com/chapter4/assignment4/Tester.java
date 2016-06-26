package com.chapter4.assignment4;

public class Tester extends Employee {
	private String testPlatform;

	

	public Tester(String firstName, String lastName, int employeeId, String salary,String role, String testPlatform) {
		super(firstName, lastName, employeeId, salary, role);
		this.testPlatform = testPlatform;
	}
	
	public void jobDescription()
	{
		System.out.println(" Tester tests the code and make sure that the application is defect free. Tester works in "+ this.testPlatform);
	}
	public void  accessToCode()
	{
		System.out.println("Developer has access to code in" + this.testPlatform);
	}
	
}
