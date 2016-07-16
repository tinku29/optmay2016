package com.two95.chap7.examp;


import java.util.*;

public class ArrayListExamp {

	public static void main(String[] args) {
		   List<String> list = new ArrayList<String>(); 
		   String t = "Hello DQ";
		   String c = "Helo Nithya";
		  
		   // Add objects.     
		   list.add("Hello");     
		   list.add("World");     
		   list.add("World");     
		   list.add("ABC"); 
		   list.add(2, t);
		   list.add(c);
		  
		   // Get the objects     
		   for (int i = 0; i < list.size(); i++) {        
			   String s1 = (String) list.get(i);       
			   System.out.println(s1);      
			   }
		   
		   
		   } 
	}

	

