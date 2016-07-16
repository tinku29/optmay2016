package com.two95.assign.assign2;
import java.util.*;
public class Armstrong{
	
	static void armstrong(int inp){
        int sum = 0;
        int temp = inp;
        int digit = 0;
        while(temp>0){
            
            digit = temp%10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;
        }if (sum == inp){
            System.out.println("The given number "+inp+" is Armstrong ");
        }
        else{
            System.out.println("the number is not Armstrong");
        }
    }
    
    
    public static void main(String[] args){
        System.out.println("Enter the number to check armstrong or not?");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        armstrong(num);
        
        
    }
}