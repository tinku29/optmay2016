package com.two95.assignment5;

public class CarClass implements CarInterface{
	String color;
	int velocity;
	
	public CarClass() {
		super();
	}
	public CarClass(String initColor){
		if((initColor.equals(RedColor))||(initColor.equals(BlueColor))){
			color=initColor;
		}
		else{
			color=NoColor;
		}
		
	}
	public void honk(){
		System.out.println("Beep,beep!!");
	}
	public void go(int newVelocity){
		velocity=newVelocity;
	}
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		velocity=0;
	}
	
}
