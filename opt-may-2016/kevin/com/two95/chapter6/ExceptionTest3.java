package com.two95.chapter6;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try{
			int i=10;
			int k=i/0;
			System.out.println(k);
			System.out.println("Hello 1");
			int a[]=new int[2];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			System.out.println("Hello 2");
		}
		catch(Exception e){
			System.out.println("Exceptions handled");
		}
		System.out.println("DONE");

	}

}
