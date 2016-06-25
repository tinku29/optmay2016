package com.two95.Assignment04;



public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystem os = new OperatingSystem("Mac", "Windows");
		OperatingSystem os2 = new OperatingSystem("linux", "ubunto");

		Computer c = new Computer("HP", "g70", "black", os);
		Laptop l = new Laptop("lenovo","l20","silver",os2,15);
		Desktop d=new Desktop("Hp","g22","white",os,"sony");
		Computer com=new Laptop("dell","a20","red",os2,12);//polymorphism
	    System.out.println(c);
	    System.out.println("-------------");
	    

		System.out.println(l);
	    System.out.println("-------------");

		System.out.println(d);
	    System.out.println("-------------");

		c.welcomeScreen();
	    System.out.println("-------------");

		com.welcomeScreen();//polymorphism
	    System.out.println("-------------");

		l.welcomeScreen();
	    System.out.println("-------------");

	}

}
