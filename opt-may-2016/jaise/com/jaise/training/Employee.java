package com.jaise.training;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private String department;

	public Employee() {
		
	}
	private Employee(String name){
		this();
		this.name = name;
	}
	private Employee(String name, int age){
		this(name);
		this.age = age;
	}
	public Employee(String name, int age, int salary){
		
		this(name,age);
		this.salary = salary;
	}
	public Employee(String name, int age, int salary, String department){
		this(name,age,salary);
		this.department = department;
	}
	public void setName(String nam){
		
		name = nam;
		
	}
public void setAge(int ag){
		age = ag;
		
		}
public void setSal(int sal){
	
	
	salary = sal;
	
	
}
public void setDepart(String dep){
	
	
	department = dep;
	
}
	public void getterEmpDetails(Employee x){
		System.out.println(x);
			
	}
	public String toString(){
		return(name+" "+age+" "+salary+" "+department );
		
	}
}
