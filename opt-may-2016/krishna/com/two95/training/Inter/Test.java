package com.two95.training.Inter;



public class Test {

	public static void main(String[] args) {

		ToyotaDealer d = new ToyotaDealer();
		d.dealer(new Toyota());
		Cars c = new Honda();
		c.carWash();
		c.dmvBuy();
		c.dmvHistoryCheck();
		Vehicle v = new Truck();
		v.dmvBuy();
	

	}

}
