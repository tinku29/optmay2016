package com.two95.Assignment02;
import java.util.Scanner;

public class BitwiseMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter two numbers");
	      Scanner input=new Scanner(System.in);
	      int a =input.nextInt();
	      int b=input.nextInt();
	      
       System.out.println(multiply(a,b)); 
	}
	public static int multiply(int n1, int n2) {
        int a = n1, b = n2, result=0;
          while (b != 0) 
        {
            if ((b & 01) != 0) 
            {
                result = result + a; 
            }
            a <<= 1;              
            b >>= 1;             
        }
        return result;
    }
	
	
	
}
