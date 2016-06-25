package com.two95.Assignment03;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(137,"venkat");
		/* e1.setEmployeeId(1054820);
		e1.setEmployeeName("venkatesh");
		PhoneNumbers ph = new PhoneNumbers(7134593117L, 9841465431L);
		e1.setPhoneNumebr(ph); 
		System.out.println(e1.getEmployeeId() + " " + e1.getEmployeeName());
		System.out.println(e1.getPhoneNumebr()); */
		
		System.out.println(e1.getDateOfJoining()+""+e1.getEmployeeName());

		Students s1 = new Students();

		s1.setStudentId(1378032);
		s1.setStudentName("ram");
		System.out.println();
		System.out.println("student id is:" + s1.getStudentId() + "student name is:" + s1.getStudentName());

		Trainer t1 = new Trainer();
		t1.setName("Lin,Jian");
		t1.setCourseName("Java");
		System.out.println();
		System.out.println(t1.getName() + " takes the course : " + t1.getCourseName());

		Car c1 = new Car();
		c1.setCompany("Honda");
		c1.setColor("red");
		System.out.println();
		System.out.println("car comapny is:" + c1.getCompany() + " car color is:" + c1.getColor());

	}

}
