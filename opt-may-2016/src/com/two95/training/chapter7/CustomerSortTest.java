package com.two95.training.chapter7;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerSortTest {

	public static void main(String[] args) {

//		TreeSet<Customer> set = new TreeSet<Customer>();
//		set.add(new Customer("John", "Smith", 12345,11));
//		set.add(new Customer("Laura", "Jackson", 456546,21));
//		set.add(new Customer("Thomas", "Edison", 78989,31));
//		Iterator<Customer> itr = set.iterator();
//		while (itr.hasNext()) {
//			Customer customer = (Customer) itr.next();
//			System.out.println(customer.getLastName() + " " + customer.getFirstName() + " " + customer.getSsn()+ " "+customer.getAge());
//		}
		
		TreeSet<String> list = new TreeSet<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
