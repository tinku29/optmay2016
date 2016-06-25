package com.jaise.training;
public class BookTest {

	public static void main(String[] args) {
		
		Book b = new Book();
		Book b1 = new Book();
		Book b2 = new Book();
		
		// SET PRICE 
		b.setPrice(9.99);
		b1.setPrice(11.99);
		b2.setPrice(10.99);
		
		// pass this object as parameter and display the result
		displayPrice(b2);

	}
	static void displayPrice(Book bb){
		double price = bb.getPrice();
		System.out.println("Price = "+price);
	}

}
