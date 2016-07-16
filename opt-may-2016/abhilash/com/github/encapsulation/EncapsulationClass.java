package com.github.encapsulation;

public class EncapsulationClass {

	public static void main(String[] args) {
 
		TrainerClass Saba = new TrainerClass();
		Saba.setTrainername("Sabarish");
		Saba.setCourse("Java");
		Saba.setCourseduration(8);
		Saba.setFee(2000);		
		
		System.out.println(Saba);
		
		
		StudentClass Akhil = new StudentClass();
		Akhil.setsName("Akhilesh");
		Akhil.setUniName("Silicion Vally University");
		Akhil.setLocation("California");
		
		System.out.println(Akhil);
		
		
		
		EmployeeClass Abhi = new EmployeeClass();
		Abhi.seteNmae("Abhilash");
		Abhi.seteId(12345);
		Abhi.setSalary(54321);
		
		System.out.println(Abhi);
		
		
		CarClass Tesla = new CarClass();	
		Tesla.setBodyType("sedan");
		Tesla.setCarModel("model s");
		Tesla.setMilage(40);
		Tesla.setPrice(500000);
		
		System.out.println(Tesla);
			
		
	}

}
