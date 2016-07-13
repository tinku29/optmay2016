package com.assignment.july9;

public class Student {
	
	String firstName;
	String lastName;
	int age;
	int height;
	
	public Student(String firstName, String lastName, int age, int height){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getAge(){
		return this.age;
	}
	public int getHeight(){
		return this.height;
	}

}
