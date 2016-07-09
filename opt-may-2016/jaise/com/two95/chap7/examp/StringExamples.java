package com.two95.chap7.examp;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		int length;
		char alpha;

		Scanner st = new Scanner(System.in);
		System.out.println("Enter the required string");
		String str = st.nextLine();
		length = str.length();
		alpha = str.charAt(length - 1);
		int a = str.indexOf("hello");
		int b = str.indexOf('j');
		System.out.println(" string is: "+str+"\nlength is: "+length+"\nlast character is: "+alpha+"\nindex of hello is: "+a+
				"\nindex of j: "+b);

	}

}
