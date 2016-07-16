package com.two95.assign.assign2;

public class Addition {
	
static int add( int a , int b){
	int result=0;
	while(b!=0){
		int carry = a&b;
		a = a^b;
		b = carry<<1;
	}
	
	return a;
	
}
public static void main(String[] args){
	int c = Addition.add(10000,100);
	System.out.println("result = " +c);
	
}

}