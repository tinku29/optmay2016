package com.two95.Assignment05;

public abstract class Animal {

	int lifetime;
	String type;
	public int getLifetime() {
		return lifetime;
	}
	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [lifetime=" + lifetime + ", type=" + type + "]";
	}
	public Animal()
	{
		
	}
	public Animal(int lifetime, String type) {
		super();
		this.lifetime = lifetime;
		this.type = type;
	}
	public  abstract void Eat();
	
	public abstract void sleep();
	
	public abstract void walk();
	
	
}
