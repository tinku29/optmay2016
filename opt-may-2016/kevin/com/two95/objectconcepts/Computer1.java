package com.two95.objectconcepts;

public class Computer1 {
	int ramSize;
	int hardDiskSize;
	String os;
	public Computer1(){
		ramSize=512;
		hardDiskSize=40;
		os="Windows XP Home";
	}
	public Computer1(int rs){
		this();
		ramSize=rs;
	}
	public Computer1(int rs,int hd){
		this(rs);
		hardDiskSize=hd;
	}
	public Computer1(int rs,int hd,String os1){
		this(rs,hd);
		os=os1;
	}
	public void compute(){
System.out.println("Computing with "+os+"with "+ramSize+"MB RAM and "+hardDiskSize+"hard disk");
}
}
