package com.two95.chapter7;
import java.util.*;

public class TreeSetDemo {
	

	
		public static void main(String args[]) {
			// Create a Hashset
			TreeSet set = new TreeSet();
			// Add objects.
			set.add("Hello");
			set.add("World");
			set.add("World");
			set.add("ABC");
			// Get the iterator
			Iterator itr = set.iterator();
			while (itr.hasNext()) {
				String s1 = (String) itr.next();
				System.out.println(s1);
			}
		}
	}

