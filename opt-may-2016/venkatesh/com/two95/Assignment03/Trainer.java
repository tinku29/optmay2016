package com.two95.Assignment03;

public class Trainer {

	private String name;
	private String qualification;
	private String courseName;
	private String courseNumber;
	private String availability;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Trainer() {
		super();
	}

	public Trainer(String name, String qualification, String courseName, String courseNumber, String availability) {
		this.name = name;
		this.qualification = qualification;
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.availability = availability;
	}

}
