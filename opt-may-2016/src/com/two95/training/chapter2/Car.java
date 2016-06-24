/**
 * 
 */
package com.two95.training.chapter2;

/**
 * sample car class
 * @author schand018c
 *
 */
public class Car {
	
	public Car(String color) {
		super();
		this.color = color;
	}


	
	String engine;
	int horsePower;
	String color;
	

	int baseLength;
	String tyres;
	
	static int run(int speed) {
		System.out.println("Car is running at "+speed+" miles per hour");
		return speed;
	}
	
	void stop() {
		System.out.println("Car is stopped");
	}
	
	void start() {
		System.out.println("Car is started");
	}
	
	public Car(String engine, int horsePower, String color) {
		this(color);
		this.engine = engine;
		this.horsePower = horsePower;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int returnValue = run(100);
		System.out.println("The return value is "+returnValue);
	}

}
