package com.two95.training.chapter2;

public class TaxPayer {
	
	int salary=10000;
	static int zipcode=19803;
	
	public static void main(String args[]) {
		System.out.println("I am in main method"+zipcode);
		// Call methods from here
		payTaxes();
		sayHi();
		
		TaxPayer taxPayerObject = new TaxPayer();
		taxPayerObject.findTaxBracket();
		
	}

	static void payTaxes() {
		System.out.println("Thanks for Paying taxes");
		zipcode=2000;
	}

	static void sayHi() {
		System.out.println("I am in sayHi method");
	}
	
	void findTaxBracket() {
		System.out.println("I find my tax bracket");
	}
}