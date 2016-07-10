package com.two95.chapter7;

import java.util.*;
import java.text.*;

public class SimpleDateFormatDemo {
	public static void main(String args[]) {
		// Case 1
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(new Date());
		System.out.println(formattedDate);
		// Case 2
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date d = sdf.parse("03/12/2005");
			System.out.println(d);
		} catch (ParseException pe) {
			System.out.println(" Unable to parse Date");
		}
	}
}
