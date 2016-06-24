package com.two95.training.chapter3;

public class HouseOwner {
	private String gun;
	private int code=111;
	public String getGun() {
		if(code==111){
			
			return gun;
		} else {
			return null;
		}
	}

	public void setGun(String gun) {
		this.gun = gun;
	}

	public String bedroom;
	public String jewelery;
	public String tv;
	
	public static void main(String[] args) {
		Home home = new Home();
		home.bedroom="bed";
		home.jewelery="jewel";
		home.tv="tv";
		
	}
}
