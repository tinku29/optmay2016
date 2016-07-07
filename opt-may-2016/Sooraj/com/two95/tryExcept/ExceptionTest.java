package com.two95.tryExcept;

public class ExceptionTest {
	
		public static void main(String args[]) {
		int i = 10;
		int j = 0;
		try {
		int k = i / j;
		System.out.println(k);
		} catch (Exception ae) {
		System.out.println("Arithmetic Exception handled");
		}
		System.out.println("Hello World");
		}
		}


