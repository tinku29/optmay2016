package com.two95.objectconcepts;

public class Computer {
	int ramSize;
	int hardDiskSize;
	String os;
	public Computer(){
		// Default Initialization
		ramSize=500;
		hardDiskSize=40;
		os="Windows XP Home";
	}
	public Computer(int rs){
		// Initialization with differnet RAM size
		ramSize=rs;
		hardDiskSize=40;
		os="Windows XP Home";
	}
	public Computer(int rs,int hd){
		// Initialization for both RAM and HD size
		ramSize=rs;
		hardDiskSize=hd;
		os="Windows XP Home";
	}
	public Computer(int rs,int hd,String os1){
		// Initialization for all the three
		ramSize=rs;
		hardDiskSize=hd;
		os=os1;
	}
	public void compute(){
		System.out.println("Computing with " + os + " with " + ramSize
				+ "MB RAM and " + hardDiskSize + "GB hard disk");
	}

}
