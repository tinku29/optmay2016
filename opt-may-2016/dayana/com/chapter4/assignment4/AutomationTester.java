package com.chapter4.assignment4;

public class AutomationTester extends Tester{
	
	private String automationPlatform;
	public AutomationTester(String firstName, String lastName, int employeeId, String salary, String role,
			String testPlatform, String automationPlatform) {
		super(firstName, lastName, employeeId, salary, role, testPlatform);
		this.automationPlatform = automationPlatform ;
	}
	
	public void jobDescription()
	{
		System.out.println("Automation Tester develops automation code in "+ this.automationPlatform);
	}

}
