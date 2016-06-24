package com.two95.objectconcepts;

public class Encapsulation {
	private String name;
	private String id;
	private int age;
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public int getAge(){
		return age;
	}
	public void setName(String newName){
		name=newName;
	}
	public void setId(String newId){
		id=newId;
	}
	public void setAge(int newAge){
		age=newAge;
	}

}
