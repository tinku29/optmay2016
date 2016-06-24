package com.two95.assignment3;

public class EncapsulationTest {

	public static void main(String[] args) {
		Car c=new Car();
		c.setModel("BMW");
		c.setMilage(20);
		System.out.println("The car model is "+c.getModel()+" and milage is "+c.getMilage());
		Employee e=new Employee();
		e.setName("Kevin Santhosh");
		e.setAge(25);
		e.setSalary(10000);
		System.out.println("The employee "+e.getName()+" with age "+e.getAge()+" is having salary "+e.getSalary());
		Trainee t=new Trainee();
		t.setName("Bessel Raj Varghese");
		t.setAge(24);
		t.setCourse("Java training");
		t.setId(121);
		System.out.println("The trainee "+t.getName()+" with age "+t.getAge()+" having trainee id "+t.getId()+" is doing "+t.getCourse());
		Student s=new Student();
		s.setName("Merin Ann Shaji");
		s.setAge(21);
		s.setSchool("M.M.A.R");
		s.setRollNo(39);
		System.out.println(s.getName()+" with age "+s.getAge()+" and roll number "+s.getRollNo()+" is studying in "+s.getSchool());
		

	}

}
