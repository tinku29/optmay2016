package com.two95.Assignment05;

public class Test {

	public static void main(String[] args) {
		Animal a = new Dog(21, "doggy");
		System.out.println(a);
		a.Eat();
		Dog d = new Dog(17, "browy");
		System.out.println(d);
		d.bark();
		Cat c = new Cat();
		c.sleep();
		c.setLifetime(11);
		c.setType("catt");
		System.out.println(c);

		Person p = new Student();
		p.eat();
		p.work();

		Person p2 = new Cat();

		p2.eat();
		p2.work();
	}

}
