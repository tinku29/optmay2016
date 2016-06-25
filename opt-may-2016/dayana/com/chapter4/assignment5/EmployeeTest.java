package com.chapter4.assignment5;

public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee dev = new Developer("Dayana", "Sunny", 9788800, "25000", "Developer", "Oracle Database");
		Employee test =  new Tester("Dennis", "Sunny", 9999991, "30000", "Tester");
		dev.accessToCode();
		dev.jobDescription();
		
		test.accessToCode();
		test.jobDescription();
		
		EmployeeDetails emp = new Developer("Keerthana", "Omman", 1111111, "45000", "Developer", "Microsoft Database");
		emp.getInsuranceDetails();
		
		EmployeeDetails emp1 = new Tester("Kevin", "Santhosh", 6666666, "75000", "Tester");
		emp1.getLeaveCalender();
		
		
	}
	
	
}
