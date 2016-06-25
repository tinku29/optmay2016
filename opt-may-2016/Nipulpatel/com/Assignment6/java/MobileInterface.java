package com.Assignment6.java;

public interface MobileInterface {
	
	

	public void getinfo();
	public void getAddress ();
	public void getCity();
	
	// if we try to make any normal method we can not make it. 
	//method dose not suppose to have a body like abstract method 
	// But we can create a default method with body .
	
	
	public default void normal(){
		
		getinfo();
		 getAddress ();
		getCity();
		
		
	}
   	

}
