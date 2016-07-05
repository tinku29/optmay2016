package com.two95.chapter6;

public class Calculator {
	void divide(int i,int j){
		try{
		if(j==0){
			
			throw new MyCustomException("Call 1 854 759 4235 for help");
		}
		else {
			System.out.println(i + "/" + j + "=" + i / j);
		}}
			
			catch (MyCustomException ex){
				String message = ex.getMessage();
				System.out.println (message);
		}
			
			

}
}

