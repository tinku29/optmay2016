package com.two95.Assignment03;

public class Students {

	private int studentId;
	private String studentName;
	private String degree;
	private String major;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Students(int studentId, String studentName, String degree, String major) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.degree = degree;
		this.major = major;
	}
	public Students() {
		super();
	}
	
	
	
}
