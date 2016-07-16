package com.two95.chapter4.ex1;

public class Car {
	private int year;
	private String color;
	private int cc;
	public Car(){
		year = 2000;
		color = "Navy Blue";
		cc = 1200;
	}
	public Car(int ye){
	this();
	year = ye;

}
	public Car(int ye, String co){
		this(ye);
		color = co;
	}
	public Car(int ye, String co, int cc){
		this(ye,co);
		this.cc = cc;
	}
	public void setColor(String clr){
		color = clr;
	}
	public void setYear(int varsham){
		year = varsham;
	}
	public void setCc(int ccc){
		cc = ccc;
	}
	public int getYear(){
		return year;
	}
	public String getColor(){
		return color;
	}
	public int getCc(){
		return cc;
	}
}
