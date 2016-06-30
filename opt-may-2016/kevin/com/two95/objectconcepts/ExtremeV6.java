package com.two95.objectconcepts;

public class ExtremeV6 extends ExtremeV5{
	public ExtremeV6(int counter){
		super(counter);
		for(int i=1;i<=counter;i++){
			System.out.println("Initialising channel "+i);
		}
	}

}
