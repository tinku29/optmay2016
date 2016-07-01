package com.github.encapsulation;

public class EmployeeClass {

	private String eNmae;
	private int salary;
	private int eId;
	public String geteNmae() {
		return eNmae;
	}
	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	public String toString(){
		return "\n Employee name is" + eNmae + "\n Employee Id is " + eId + "\n Employee Salary is " + salary;
	}
	
	

}
