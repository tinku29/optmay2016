package com.two95.chapter4.inheritance;

public class Address {
	private String stno;
	private String stname;
	private String city;
	private String state;
	private String country;
	private String pincode;
	public Address() {
	}
	public Address(String stno, String stname, String city, String state, String country, String pincode) {
		super();
		this.stno = stno;
		this.stname = stname;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getStno() {
		return stno;
	}
	public void setStno(String stno) {
		this.stno = stno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [stno=" + stno + ", stname=" + stname + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
	

}
