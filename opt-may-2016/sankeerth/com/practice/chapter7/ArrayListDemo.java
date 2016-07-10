package com.practice.chapter7;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Create an ArrayList
		
		List<String> list = new ArrayList<String>();
		//Add Objects.
		list.add("Hello");
		list.add("Sankeerth");
		list.add("World");
		list.add("Sankeerth");
		list.add(1, "2nd Element");
		
		//Get the objects
		for (int i = 0; i < list.size(); i++){
			String s1 = (String) list.get(i);
			System.out.println(s1);
		}

	}

}
