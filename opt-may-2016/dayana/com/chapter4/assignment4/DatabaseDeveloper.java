package com.chapter4.assignment4;

public class DatabaseDeveloper extends Developer{
	private String databaseRole;

	
	
	public DatabaseDeveloper(String firstName, String lastName, int employeeId, String salary, String role,
			String technology, String databaseRole) {
		super(firstName, lastName, employeeId, salary, role, technology);
		this.databaseRole = databaseRole;
	}



	public void jobDescription(){
		System.out.println(this.databaseRole +" designs databse and maintain the company database");
	}

}
