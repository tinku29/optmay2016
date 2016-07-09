package com.two95.objectconcepts;

public class ProcessorTest {

	public static void main(String[] args) {
		System.out.println("Using Processor");
		Processor p1=new Processor();
		p1.execute();
		System.out.println("Using Advanced Processor");
		AdvancedProcessor p2=new AdvancedProcessor();
		p2.execute();
		

	}

}
