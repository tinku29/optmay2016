package com.two95.ch7.assignment;

public class GenericClassDemo<T> {

	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public GenericClassDemo(T id) {
		super();
		this.id = id;
	}

	public GenericClassDemo() {

	}

	public static void main(String[] args) {
		GenericClassDemo<Integer> id = new GenericClassDemo<Integer>(3303);
		GenericClassDemo<String> id1 = new GenericClassDemo<String>("isam3303");

		System.out.println(id.getId());
		System.out.println(id1.getId());
	}

}
