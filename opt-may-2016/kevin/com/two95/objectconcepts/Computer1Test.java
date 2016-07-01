package com.two95.objectconcepts;

public class Computer1Test {

	public static void main(String[] args) {
		Computer1 c1=new Computer1();
		Computer1 c2=new Computer1(600);
		Computer1 c3=new Computer1(700,850);
		Computer1 c4=new Computer1(4000,512,"Windows 7");
		c1.compute();
		c2.compute();
		c3.compute();
		c4.compute();
		

	}

}
