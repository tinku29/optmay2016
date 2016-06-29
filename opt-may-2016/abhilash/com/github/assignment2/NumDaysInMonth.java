package com.github.assignment2;

import java.util.Scanner;

public class NumDaysInMonth {

	public static void main(String[] args) {
		
		
		for (int i=0; i<=100; i++){
		
		System.out.println("ENTER THE MONTHR NUMBER");
		 int days=0;
	   	Scanner sc = new Scanner(System.in);
	   	int n= sc.nextInt();
	   //	String month = sc.next();
	   
	   	
		switch(n) {
		
		case 1: 
	//	case month:
			days = 31;
		
		 	break;
		case 2 : days = 28;
			break;
		case 3 : days = 31;
			 break;
		case 4 : days = 30;
			 break;
		case 5 : days = 31;
			 break;
		case 6 : days = 30;
			 break;
		case 7 : days = 31;
			 break;
		case 8 : days = 30;
			 break;
		case 9 : days = 31;
			 break;
		case 10 : days = 30;
			 break;
		case 11 : days = 31;
			 break;
		case 12 : days = 30;
			 break;
		default :
				System.out.println("ENTER CORRECT MONTH NUMBER");
		}
			
	 	System.out.println(days);
		 
		}
	}		
		
	}

 
