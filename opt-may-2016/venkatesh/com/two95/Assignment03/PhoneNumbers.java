package com.two95.Assignment03;

public class PhoneNumbers {

	public long phno1;
	public long phno2;
	public long phno3;
	public PhoneNumbers(long phno1, long phno2, long phno3) {
		super();
		this.phno1 = phno1;
		this.phno2 = phno2;
		this.phno3 = phno3;
	}
	public PhoneNumbers(long phno1, long phno2) {
		super();
		this.phno1 = phno1;
		this.phno2 = phno2;
	}
	public PhoneNumbers(long phno1) {
		super();
		this.phno1 = phno1;
	}
	public PhoneNumbers() {
		super();
	}
	
	
	public String toString()
	{
		return "phone number 1 is:" +phno1+"phone number 2 is:"+phno2;
	}
	
	
	
}
