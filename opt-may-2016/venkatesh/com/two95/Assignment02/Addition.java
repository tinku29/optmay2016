package com.two95.Assignment02;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter two numbers");
	      Scanner input=new Scanner(System.in);
	      int a =input.nextInt();
	      int b=input.nextInt();
	      
        System.out.println(sum(a,b)); 
	}

	
	
	public static int sum(int a, int b){  
        while (b != 0){
            int carry = (a & b) ; 
          
            a = a ^b; 
          
            b = carry << 1; 
        }
        return a;      
 }



}
