package com.two95.chapter4.inheritance;

public class Home {
private int members;
private int rooms;
private double sft;
private Address address;
public Home() {
	
}
public Home(int members, int rooms, double sft, Address address) {
	
	this.members = members;
	this.rooms = rooms;
	this.sft = sft;
	this.address = address;
}
public void disp(){
	System.out.println(" Home information-sft = "+sft+"number of rooms = "+rooms);
	
}

public int getMembers() {
	return members;
}
public void setMembers(int members) {
	this.members = members;
}
public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
public double getSft() {
	return sft;
}
public void setSft(double sft) {
	this.sft = sft;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public double computeTax(double rate, double sft){
	
	
	return rate*sft;
}
@Override
public String toString() {
	return "Home [members=" + members + ", rooms=" + rooms + ", sft=" + sft + ", address=" + address + "]";
}


}
