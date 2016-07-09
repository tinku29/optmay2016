package com.two95.tryExcept;

public class Calculator {
	void divide(int i, int j){
		
		if (j==0){
			try{
			throw new MyCustomeException("There has been an error in the input");
			}
			catch(MyCustomeException ex){
				String message=ex.getMessage();
				System.out.println(message);
			}
		}else{
			System.out.println("The resule is " +i/j);
		}
			
		
	}
	
}

