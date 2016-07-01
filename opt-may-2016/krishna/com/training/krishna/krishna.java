package com.training.krishna;

 class rec {
	int fact(int x) {
		int result;
		if (x>25)
			return 0;
		result= fact(x+1)+x;
		return result;
	}
	}
class krishna{
	public static void main(String args[]) {
		rec f = new rec();
		System.out.println(f.fact(10));
	}
}
	

