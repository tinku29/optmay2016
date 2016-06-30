package com.two95.objectconcepts;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setFirstName("Kevin");
		c1.setLastName("Santhosh");
		c1.setAddress("277 Gifford Pl,NJ");
		String s1=c1.getFirstName();
		String s2=c1.getLastName();
		String s3=c1.getAddress();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
