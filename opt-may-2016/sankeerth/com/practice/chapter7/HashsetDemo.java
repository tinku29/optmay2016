package com.practice.chapter7;

import java.util.*;

public class HashsetDemo {

	public static void main(String[] args) {
		
		//Create a HashSet
		//Set<String> set = new HashSet<String>();
		//Create a TreeSet
		Set<String> set = new TreeSet<String>();
		
		
		//Add objects
		set.add("Hello");
		set.add("2World");
		set.add("1World");
		set.add("ABC");
		
		//Get the iterator
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);
		}

	}

}
