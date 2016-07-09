/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Collections (Assignment 8)
 * Scope :Print the name and email address of all the students in 
 *        opt-june batch using collections, generic and for-each
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.utilitiesCh7.java.Customer;

public class StudentEmailFatcher {

	public static void main(String[] args) {
		
		List<String> String = new ArrayList<>(); 
		
		Customer c1 = new Customer("John", "Smith", 12345);
		Customer c2 = new Customer("Laura", "Jackson", 456546);
		Customer c3 = new Customer("Thomas", "Edison", 78989);
		// Create a hashmap
		StudentName S = new StudentName("jakkku","jakkulaakhilesh@gmail.com");
		StudentName S1 = new StudentName("Abhilash","madhavaram.tinku@gmail.com");
		StudentName S2 = new StudentName("Sooraj","bu34226n@pace.edu");
		StudentName S3 = new StudentName("Sharanya","sharanya.s215@gmail.com");
		StudentName S4 = new StudentName("Dayana","dmallass@hawk.iit.edu ");
		StudentName S5 = new StudentName("Kalyalam","kalyanamkrish@gmail.com ");
		StudentName S6 = new StudentName("Bhavin","psbhavin@gmail.com");
		StudentName S7 = new StudentName("Jais","j.jaise1@gmail.com");
		StudentName S8 = new StudentName("Nipul","nipulguru.patel@gmail.com");
		StudentName S9 = new StudentName("Sankeerth","sankeerth999@gmail.com");
		

	
	
	HashMap<String, StudentName> map = new HashMap<String, StudentName>();
	// Store the data using ssn as the key
	// creating a map object with the generic format  
	map.put("jakkku", S);
	map.put("Abhilash", S1);
	map.put("Nipul", S8);
	// Get Smiths info
	
	StudentName student = (StudentName) map.get("jakkku");
	System.out.println(student.getFirstName() + " " + student.getEmail());
}

}
