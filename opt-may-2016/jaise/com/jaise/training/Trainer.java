package com.jaise.training;

public class Trainer {
	private String name;
	private String course;
	private int hours;
	public Trainer(){
		
	}
	public Trainer(String name){
		this.name = name;
	}
	public Trainer(String name, String course){
		this(name);
		this.course = course;
	}
	public Trainer(String name, String course, int hours){
	this.name = name;
	this.course = course;
	this.hours = hours;
	}
	public void setName(String na){
	name = na;
	}
	public void setCourse(String cou){
		
		course = cou;
	}
	public void sethours(int hou){
		hours = hou;
	}
	public void getName(){
		System.out.println(name);
	}
	public void getCourse(){
		System.out.println(course);
	}
	public void getHours(){
		System.out.println(hours);
	}
	public String toString(){
		return(name+" "+course+" "+hours);
	}
}
