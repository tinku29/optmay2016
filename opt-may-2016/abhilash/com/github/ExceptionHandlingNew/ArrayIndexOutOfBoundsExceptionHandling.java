package com.github.ExceptionHandlingNew;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandling {

	public static void main(String[] args) {
		 
		String array[] = { "ab","bc","cd","de","ef","fg","gh"};
		
		
		try{
			System.out.println("Entere An Index Number");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println(array[a]);
		} catch(ArrayIndexOutOfBoundsException  ae){
		System.out.println("index number " + ae.getMessage() + " ---> Array Index Out Of Bounds Exception \nEnetr A Valid Index Number");
		}

		
		
	}

}
