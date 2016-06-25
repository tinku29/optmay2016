package com.assigment.java;

public class Trainner {
	
	protected String TrainerName = "";
	private int Trainercode  ;
	public String TrainerDepartment = "";
	
	
	public String getTrainerName() {
		return TrainerName;
	}
	public void setTrainerName(String trainerName) {
		TrainerName = trainerName;
	}

	public int getTrainercode() {
		return Trainercode;
	}
	public void setTrainercode(int trainercode) {
		Trainercode = trainercode;
	}
	public String getTrainerDepartment() {
		return TrainerDepartment;
	}
	public void setTrainerDepartment(String trainerDepartment) {
		TrainerDepartment = trainerDepartment;
	}
	// Constructor
	Trainner(){
		TrainerName = "Trainer name is Subrish";
	 TrainerDepartment = "Trainner is works on Tow95Java Department ";
	 System.out.println( TrainerName);
	 System.out.println( TrainerDepartment);		
	}
	Trainner(int Trainercode ){
		
		Trainercode=007;
		System.out.println( "trainner code is "+Trainercode);
}
	
	
	}
