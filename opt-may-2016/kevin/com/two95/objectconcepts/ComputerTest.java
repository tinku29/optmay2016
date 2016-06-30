package com.two95.objectconcepts;

public class ComputerTest {

	public static void main(String[] args) {
	Computer c1=new Computer();
	Computer c2=new Computer(4);
	Computer c3=new Computer(4,512);
	Computer c4=new Computer(16,1000,"Windows10");
	c1.compute();
	c2.compute();
	c3.compute();
	c4.compute();

	}

}
