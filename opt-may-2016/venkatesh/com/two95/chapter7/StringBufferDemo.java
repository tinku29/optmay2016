package com.two95.chapter7;

import java.util.Date;

public class StringBufferDemo {

	public static void main(String args[]) {
		Date d = new Date();
		System.out.println(SimpleDateFormatDemo.getDate());
		System.out.println(d);
		StringBuffer buffer = new StringBuffer("buffer initial value");
		buffer.append("first value added");
		buffer.append("second value added");
		String finalValue = buffer.toString();
		System.out.println(finalValue);

	}

}