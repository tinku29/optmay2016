package com.two95.inheritancetest;

import com.two95.chapter4.inheritance.Address;
import com.two95.chapter4.inheritance.IndividualHouse;
import com.two95.chapter4.inheritance.Villa;

public class Test {

	public static void main(String[] args) {
		//test class for Individual House
		Address vilasam = new Address("502","Rhode island ave", "cherry hill","new jersey", "usa", "80002");
		IndividualHouse valiyaveettil = new IndividualHouse(5,5,3000,vilasam,2);
	
	vilasam.setState("Texas");
	System.out.println("Valiyaveettil"+valiyaveettil);
	double y = valiyaveettil.getSft();
	double tax = valiyaveettil.computeTax(2.5, y);
	System.out.println("taxcomputation " +tax);
	
	//test for villa
	
			Address patha = new Address("502","Rhode island ave", "cherry hill","new jersey", "usa", "80002");
			Villa kalapurayil = new Villa(6,7,6000,patha,2,3);
		
		patha.setState("California");
		System.out.println("kalapurayil"+kalapurayil);
		double z = kalapurayil.getSft();
		double taxVi = kalapurayil.computeTax(2.5, z);
		System.out.println("taxcomputation " +taxVi);
	}

}
