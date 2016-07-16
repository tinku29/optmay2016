package com.two95.objectconcepts;

public class BookTest {

	public static void main(String[] args) {
		//Creates a Book object
		Book b=new Book();
		//Set the price
		b.setPrice(25.99);
		//Pass this Book object as a parameter and displays the price
		displayPrice(b);
}
	static void displayPrice(Book b1){
		//Read the price
		double price=b1.getPrice();
		System.out.println(price);
	}

}
