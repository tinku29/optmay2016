package com.sharanya.training;

public class Student {
	String firstName;
	String lastName;
	Double gpa;
	int studentID;
	public Student(String firstName, String lastName, Double gpa, int studentID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.studentID = studentID;
	}
	
	public void  display()
	{
		System.out.println("student first Name is "+firstName);
		System.out.println("student Last Name is "+lastName);
		System.out.println("Student GPA is"+gpa);
		System.out.println("Student ID is "+studentID);
		
		
	}
	

}
