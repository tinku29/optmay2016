package com.jaise.training;

public class Test {

	public static void main(String[] args) {
		//car class test
		Car c1 = new Car(2016);
		System.out.println(c1.getYear()+" "+c1.getColor()+" "+c1.getCc());
		c1.setColor("White");
		c1.setYear(2015);
		c1.setCc(2048);
		System.out.println("After a setter is called");
		System.out.println(c1.getYear()+" "+c1.getColor()+" "+c1.getCc());
		
		//Employee Class test
		Employee e1 = new Employee("Jaise",24,100000,"development");
		
		e1.getterEmpDetails(e1);
		System.out.println("after setter");
		e1.setAge(23);
		e1.getterEmpDetails(e1);
		
		//Trainer class test
		Trainer t1 = new Trainer("Sabarish", "Java J2EE", 3);
		Trainer t2 = new Trainer();
		System.out.println("after the constructor is called");
		System.out.println(t1);
		System.out.println("after the setter is called");
		t2.sethours(4);
		
		System.out.println(t2);
		//Student class test
		System.out.println("Student class");
		Student st1 = new Student("JAISE","MSCoE", 24, 3.5);
		st1.getName();
		st1.setName("Jaise John");
		st1.getName();
		
	}

}
