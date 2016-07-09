package com.practice.chapter7;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Sourav Ganguly is the ");
		buffer.append("greatest cricketer ");
		buffer.append("in the world!");
		
		buffer.insert(7, "Chandidas ");
		
		String finalText = buffer.toString();
		System.out.println(finalText);

	}

}
