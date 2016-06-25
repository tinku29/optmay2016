package com.chapter4.assignment4;

public class EmployeeTest {

	public static void main(String[] args) {
		
		DatabaseDeveloper dbDev = new DatabaseDeveloper("Dayana", "Sunny", 9788800, "25000", "Developer", "Oracle Database", "Database Admin"); 
		AutomationTester autoTester =  new AutomationTester("Dennis", "Sunny", 9999991, "30000", "Tester", "Selenium", "Web Selenium");
		
		System.out.println("Develoepr Profile and Job Description");
		System.out.println("=============================================");
		dbDev.getEmployeeProfile();
		dbDev.jobDescription();
		
		System.out.println("Tester Profile and Job Description");
		System.out.println("=============================================");
		autoTester.getEmployeeProfile();
		autoTester.jobDescription();
	}

}
