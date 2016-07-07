package com.two95.objectconcepts;

public class Processor {
	public void start(){
		System.out.println("The process begins");
	}
	public void process(){
		System.out.println("Processing Step 1");
		System.out.println("Processing Step 2");
		System.out.println("Processing Step 3");
		System.out.println("Processing Step 4");
	}
	public void stop(){
		System.out.println("Processing completed");
	}
	public void execute(){
		start();
		process();
		stop();
	}

}
