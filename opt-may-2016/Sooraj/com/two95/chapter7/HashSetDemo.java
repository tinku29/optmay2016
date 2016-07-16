package com.two95.chapter7;

import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {
		// Create a Hashset
		Set set = new HashSet();
		// Add objects.
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("ABC");
		set.add("XYZ");
		set.add("JKL");
		// Get the iterator
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);
		}
	}
}
