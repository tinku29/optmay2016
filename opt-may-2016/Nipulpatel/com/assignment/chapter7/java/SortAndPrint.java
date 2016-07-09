/***************************************************************
 * @author Nipul								 date:7/8/2016 
 * project:Generic (Assignment 8)
 * Scope :Sort and print the students in opt-june batch by last
 *  name, age, first name and height
 * Scope change : none
 * class : Main class
 ***************************************************************/

package com.assignment.chapter7.java;

import java.util.*;

public class SortAndPrint {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new LastNameComparator());
		set.add(new OptStudent("Nipul", "Patel", 23,"5.9 feet"));
		set.add(new OptStudent("Roni", "Jackson", 24,"5.8 feet"));
		set.add(new OptStudent("Abhilash", "Madhvram", 23,"5.9 feet"));
		
		
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			OptStudent student = (OptStudent) itr.next();
		System.out.println(student.getLastName() + " "
		+ student.getFirstName() + " " + student.getSsn() +"   "+ student.getHeight());
		}
		}
		
		

	}

	
	
