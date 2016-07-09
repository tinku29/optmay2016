package com.two95.chapter7;

public class StringClassDemo {

	public static void main(String[] args) {
		String str="My name is Kevin Santhosh";
		String name="Kevin";
		String name1="BESSEL";
		int length=str.length();
		System.out.println("The length of the string is "+length);
		char ch=str.charAt(5);
		System.out.println("Character at position 5 is "+ch);
		int a=str.indexOf('K');
		int b=str.indexOf("name");
		System.out.println("Position of the character K is "+a);
		System.out.println("Position of the string name is "+b);
		String s1=str.substring(10);
		String s2=str.substring(3, 16);
		System.out.println(s1);
		System.out.println(s2);
		if(str.equals("My name is Bessel")){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
		if(str.equalsIgnoreCase("mY nAMe iS kEVin SAnThosh")){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("They are not equal");
		}
		String newName=name.toUpperCase();
		String  name2=name1.toLowerCase();
		System.out.println(newName);
		System.out.println(name2);
		

	}

}
