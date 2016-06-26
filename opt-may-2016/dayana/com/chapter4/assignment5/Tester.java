package com.chapter4.assignment5;

public class Tester extends Employee implements EmployeeDetails{
	public Tester(String firstName, String lastName, int employeeId, String salary, String designation) {
		super(firstName, lastName, employeeId, salary, designation);
		
	}
	public void  accessToCode()
	{
		System.out.println("Tester does not have access to code");
	}
	@Override
	public void jobDescription() {
		System.out.println(" Tester tests the code and make sure that the application is defect free.");		
	}
	@Override
	public void getInsuranceDetails() {
		System.out.println("Tester is insured");
		
	}
	@Override
	public void getLeaveCalender() {
		System.out.println("Display the leave calender for employee Tester");
		
	}
	

}
