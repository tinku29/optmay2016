package com.assignment.july9;

import java.util.Comparator;

public class LastNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		int index = s1.getLastName().compareTo(s2.getLastName());
		return index;
	}

}
