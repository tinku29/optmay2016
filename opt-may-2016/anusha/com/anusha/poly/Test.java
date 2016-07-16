package com.anusha.poly;

public class Test {

	public static void main(String[] args) {
		Honda h =new Honda();
		Suzuki s=new Suzuki();
		Toyota t =new Toyota();
		
		Truck tr = new Truck();
		CarWash cw = new CarWash();
		cw.wash(h);
		cw.wash(t);
		cw.wash(s);
		ToyataDealer td = new ToyataDealer();
		td.sell(t);
		DMV d = new DMV();
		d.register(s);
		d.register(h);
		d.register(h);
		d.register(tr);
	
		
		
		
		
		
		

	}

}
