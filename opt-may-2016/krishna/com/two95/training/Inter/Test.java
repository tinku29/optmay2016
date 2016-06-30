package com.two95.training.Inter;

public class Test {

	public static void main(String[] args) {

		Toyota t = new ToyotaDealer();
		t.dmvBuy();
		Cars c = new Honda();
		c.carWash();
		c.dmvBuy();
		c.dmvHistoryCheck();
		Vehicle v = new Truck();
		v.dmvBuy();

	}

}
