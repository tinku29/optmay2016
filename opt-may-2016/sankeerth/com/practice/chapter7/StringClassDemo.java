package com.practice.chapter7;

public class StringClassDemo {

	public static void main(String[] args) {
		
		String str = "This is really really big text";
		
		int length = str.length();
		System.out.println("The length of the text is " + length);
		
		char ch = str.charAt(6);
		System.out.println(ch);
		
		int pos1 = str.indexOf('s');
		int pos2 = str.indexOf("really");
		
		System.out.println(pos1);
		System.out.println(pos2);
		
		String s1 = str.substring(22);
		String s2 = str.substring(8, 22);
		
		System.out.println(s1);
		System.out.println(s2);
		
		if (str.equals("this is really really big text")){
			System.out.println("Equal Strings");
		}else {
			System.out.println("Check the case fucker");
		}
		if (str.equalsIgnoreCase("this is really really big text")){
			System.out.println("Equal");
		}

	}

}
