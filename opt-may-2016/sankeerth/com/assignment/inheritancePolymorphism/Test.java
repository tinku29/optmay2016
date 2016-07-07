package com.assignment.inheritancePolymorphism;

public class Test {

	public static void main(String[] args) {
		
		Vehicle vc = new Car();
		vc.dmv();
		System.out.println("=========================");
		
		Vehicle vt = new Truck();
		vt.dmv();
		System.out.println("=========================");
		
		Car ch = new Honda();
		ch.dmv();
		ch.carWash();
		System.out.println("=========================");
		
		Car cs = new Suzuki();
		cs.dmv();
		cs.carWash();
		System.out.println("=========================");
		
		Car ct = new Toyota();
		ct.dmv();
		ct.carWash();
		
		Toyota t = new Toyota();
		t.toyotaDealer();

	}

}
