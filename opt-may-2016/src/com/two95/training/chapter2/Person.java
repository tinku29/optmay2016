/**
 * 
 */
package com.two95.training.chapter2;

/**
 * sample person
 * 
 * @author schand018c
 *
 */
public class Person {
	static String name;
	static int age;
	String gender;
	int height;
	int weight;
	String color;
	static {
		
		System.out.println("Inside static block");
		//static block
		name="Abhilash";
		age=22;
		
	}



	void talk() {
		System.out.println("TALK");
	}

	void walk() {
		System.out.println("WALK");
	}

	static void eat() {
		System.out.println("EAT");
	}

	static void drink(String liquid) {
		System.out.println("DRINK "+liquid);
	}

	void think() {
		System.out.println("THINK");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println("Name of the person is "+name);
		TaxPayer.payTaxes();
		
		TaxPayer taxPayerObject = new TaxPayer();
		taxPayerObject.findTaxBracket();
		
	}

}
