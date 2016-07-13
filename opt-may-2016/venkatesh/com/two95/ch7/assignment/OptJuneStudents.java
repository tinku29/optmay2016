package com.two95.ch7.assignment;
import java.util.List;

public class OptJuneStudents implements Comparable<OptJuneStudents> {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private double height;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public OptJuneStudents(String name, String email, int age, double height) {
		this.firstName = name;
		this.email = email;
		this.age = age;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OptJuneStudents(String name, String email) {
		super();
		this.firstName = name;
		this.email = email;
	}

	public OptJuneStudents(String firstName, String lastName, String email, int age, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.height = height;
	}

	public OptJuneStudents() {
	}

	@Override
	public String toString() {
		return "OptJuneStudents [name=" + firstName + ", email=" + email + "]";
	}

	public static <T> void display(List<T> students) {
		for (T student : students) {
			System.out.println(student);
		}
	}

	@Override
	public int compareTo(OptJuneStudents o) {
		
		if(this.age>o.age) {
			return 1;
		} else if(this.age<o.age) {
			return -1 ;
		} else {
			return 0;
		}
	}
}
