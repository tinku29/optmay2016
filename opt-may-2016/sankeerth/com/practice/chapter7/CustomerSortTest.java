package com.practice.chapter7;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerSortTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new LastNameComparator());
		
		set.add(new Customer("John", "Smith", 12335));
		set.add(new Customer("Sankeerth", "Reddy", 12985));
		set.add(new Customer("James", "Bond", 16007));
		
		Iterator itr = set.iterator();
		while (itr.hasNext()){
			
			Customer customer = (Customer) itr.next();
			
			System.out.println(customer.getLastName() + " " 
					+ customer.getFirstName() + " " + customer.getSsn());
		}
		
	}

}
