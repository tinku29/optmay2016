package com.two95.BasicAssignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		System.out.println("The prime numbers between 1 and 100 are");
		for (int i=2;i<100;i++){
			int counter=0;
			for (int j=2; j<i;j++){
			if (i%j==0){
				counter++;
			}}
				if(counter==0)
					System.out.println(i+ "");
				
}


	}
	
	}
