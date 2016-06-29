package com.github.assignment2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
 
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
	   	int n = sc.nextInt();	   
	   	 int a=n;
	   	
	for(int i=1;i<=n;i++){
		int even=2*i;
		if(even ==a){
			System.out.println("even number");
		}
		
	}
	   		for(int j=1;j<=n;j++){
	   			int odd=(2*j)+1;
	   			//System.out.print(odd);
	   			if(odd ==a){
	   				System.out.println("odd number");
	   			}
	   		}
	 	
	   	 
	   				
	   		
		
	}

	}
