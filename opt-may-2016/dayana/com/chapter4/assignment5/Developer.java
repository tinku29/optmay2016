package com.chapter4.assignment5;

public class Developer extends Employee implements EmployeeDetails {

	private String technology;
	public Developer(String firstName, String lastName, int employeeId, String salary, String designation, String technology) {
		super(firstName, lastName, employeeId, salary, designation);
		this.technology = technology;
	}
	@Override
	public void jobDescription()
	{
		System.out.println(" Developer designs and code and develops the software in" + this.technology);
	}
	
	public  void accessToCode()
	{
		System.out.println("Developer has access to code in" + this.technology);
	}
	@Override
	public void getInsuranceDetails() {
		System.out.println("Developer is insured");
		
	}
	@Override
	public void getLeaveCalender() {
		System.out.println("Display the leave calender for Employee developer");
		
	}
}
