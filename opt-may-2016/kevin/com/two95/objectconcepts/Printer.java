package com.two95.objectconcepts;

public class Printer {
	static int paperCount=1;
	static void print(){
		if(paperCount>0){
			paperCount=paperCount-1;
			System.out.println("Document displayed");
		}
		else{
			System.out.println("Please put the paper in the tray");
		}
	}
	void printDocument(){
		print();
	}
	}
	
	
