package com.github.inheritance;

public class Honda extends Car {
	Honda()
	{
		super("Honda",26,3000);
 	}

	public static void main(String[] args) {
		
		Honda h = new Honda();
		h.printDetails();
		//System.out.println(h);
		h.bodyType("sedan");
		h.fuel("petrol");
		Engin e = new Engin(123,234);
		h.setEngNum(e);
 		System.out.println(h.getEngNum());		
		
	}

}
