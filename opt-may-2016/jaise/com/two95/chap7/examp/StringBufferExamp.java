package com.two95.chap7.examp;

public class StringBufferExamp {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Hi!!!");
		buf.append("My name is");
		buf.append(" Jaise John");
		System.out.println("the string is : "+buf);
		int len = buf.length();
		buf.insert(len, ".So Howdy!!!");
		len = buf.length();
		System.out.println("the length of the string is : "+len);
		String text = buf.toString();
		System.out.println("the text in string object text is: "+text);

	}

}
