package com.sharanya.training;


public class TestEmp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(4000);

		int empSalary = employee.getSalary();
		System.out.println("Employee Salary " + empSalary);

	}

}
