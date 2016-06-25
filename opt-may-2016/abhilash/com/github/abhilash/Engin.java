package com.github.abhilash;

public class Engin {
	
	private int engin1;
	private int engin2;
	public int getEngin1() {
		return engin1;
	}
	public void setEngin1(int engin1) {
		this.engin1 = engin1;
	}
	public int getEngin2() {
		return engin2;
	}
	public void setEngin2(int engin2) {
		this.engin2 = engin2;
	}
	
	
	
	public Engin() {
		super();
	}
	public Engin(int engin1, int engin2) {
		super();
		this.engin1 = engin1;
		this.engin2 = engin2;
	}
	@Override
	public String toString() {
		return "Engin [engin1=" + engin1 + ", engin2=" + engin2 + "]";
	}
	
	
	

}
