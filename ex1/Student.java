package com.two95.chapter4.ex1;

public class Student {
	private String name;
	private String degree;
	private int age;
	private double gpa;
	public void Student(){
		
	}
	public Student(String name, String degree, int age, double gpa){
		this.name = name;
		this.degree = degree;
		this.age = age;
		this.gpa = gpa;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDegree(String degree){
		this.degree = degree;
		}
	public void setAge(int age){
		this.age = age;
		}
	public void setGpa(double gpa){
		this.gpa = gpa;
		}
	public void getName(){
		System.out.println("Name = "+name);
	}
	public void getDegree(){
		System.out.println("Degree = "+degree);
		}
	public void getAge(){
		System.out.println("age= "+age );
		}
	public void getGpa(){
		System.out.println("gpa= "+gpa );
		}
	
}
