package com.two95.Assignment05;

public class Student implements Person {
String name;
String id;

	public Student() {
	super();
}

	public Student(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

	@Override
	public void work() {
		System.out.println("students can do part time job");

	}

	@Override
	public void eat() {

		System.out.println("students eat at canteen");
	}

	@Override
	public void sleep() {
		System.out.println("students sleeps till afternoon");
	}

	
}
