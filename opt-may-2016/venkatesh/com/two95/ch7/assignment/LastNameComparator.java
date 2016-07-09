package com.two95.ch7.assignment;
import java.util.Comparator;

public class LastNameComparator implements Comparator<OptJuneStudents> {

	@Override
	public int compare(OptJuneStudents s1, OptJuneStudents s2) {

		int index = s1.getLastName().compareTo(s2.getLastName());

		return index;
	}

}
