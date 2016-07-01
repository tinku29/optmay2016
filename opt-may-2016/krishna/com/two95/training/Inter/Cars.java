package com.two95.training.Inter;

public class Cars extends Vehicle {
	@override
	public void dmvBuy() {
		System.out.println("All cars should be regitered through DMV");
	}

	@override
	public void dmvSell() {
		System.out.println("All cars ownership is tranferred through DMV after selling");

	}

	@override
	public void dmvHistoryCheck() {
		System.out.println("Check the car history through DMV");
	}

	public void carWash() {
		System.out.println("Washes all Car");
	}

}
