package com.practice.chapter7;
import java.util.*;

public class LastNameComparator implements Comparator<Object> {

	public int compare(Object oz, Object oy) {
		Customer c1 = (Customer) oz;
		Customer c2 = (Customer) oy;
		
		int index = c1.getLastName().compareTo(c2.getLastName());
		
		return -index;
	}
}
