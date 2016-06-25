package com.two95.Assignment03;

public class Employee {

	private int employeeId;
	private String employeeName;
	private int ssn;
	private String dateOfJoining;
	private String onsiteLocation;
	private PhoneNumbers phoneNumebr;

	public Employee(int employeeId, String employeeName, int ssn, String dateOfJoining, String onsiteLocation,
			PhoneNumbers phoneNumebr) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.ssn = ssn;
		this.dateOfJoining = dateOfJoining;
		this.onsiteLocation = onsiteLocation;
		this.phoneNumebr = phoneNumebr;
	}

	public PhoneNumbers getPhoneNumebr() {
		return phoneNumebr;
	}

	public void setPhoneNumebr(PhoneNumbers phoneNumebr) {
		this.phoneNumebr = phoneNumebr;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getOnsiteLocation() {
		return onsiteLocation;
	}

	public void setOnsiteLocation(String onsiteLocation) {
		this.onsiteLocation = onsiteLocation;
	}

	public Employee() {
	
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(int employeeId, String employeeName, int ssn, String dateOfJoining, String onsiteLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.ssn = ssn;
		this.dateOfJoining = dateOfJoining;
		this.onsiteLocation = onsiteLocation;
	}

}
