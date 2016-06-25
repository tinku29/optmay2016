
/***************************************************************
 * @author Nipul								 date:6/21/2016 
 *project:Assignment 4
 * Scope :Write a program to  Encapsulated class with getter and setter method with constrcutor for
 * Scope change : none
 *class : Main class (Test class )
 ***************************************************************/



package com.assigment.java;

public class MyClass {

	public static void main(String[] args) {
		// for car class 
		System.out.println( "1..for car class");
		car Ref = new car();
		System.out.println( Ref.getCarName());
		System.out.println( Ref.getEnginType());
		System.out.println( Ref.getModel());
		
		// for Employee class
		System.out.println( "2..for Employee class");
		
		Employee Ref2 = new Employee();
		Ref2.getName();
		Employee Ref3 = new Employee(4);//it should be int value 
		// otherwise it will print same "nipul"
		Ref3.getEmployeeNumber( );
		//
		// for trainer class 
		System.out.println( "3..for Trainer class");
		
		Trainner ref4 = new Trainner();
		ref4.getTrainerName();
		Trainner ref5 = new Trainner(7);
		ref5.getTrainercode();
	
		// for student class 
		
		
		Student Ref6 = new Student();
		System.out.println( "Total marks "+Ref6.getTotalMarks());
		System.out.println( "math marks "+Ref6.getMarksMath());
		
		
	}

}
