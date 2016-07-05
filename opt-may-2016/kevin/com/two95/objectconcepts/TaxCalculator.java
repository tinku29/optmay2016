package com.two95.objectconcepts;

public class TaxCalculator {
	//Details
	private double federalReturn;
	private double stateReturn;
	private double miscReturn;
	private double computeFedral(double amount){
		return 0.1*amount;
	}
	private double computeState(double amount){
		return 0.05*amount;
	}
	private double computeMisc(double amount,double misc){
		return 0.1*amount+.05*misc;
	}
	//Essentials
	public double getMyReturns(double federalWithHeld,double stateWithHeld,double expenses,double misc){
		federalReturn=computeFedral(federalWithHeld);
		stateReturn=computeState(stateWithHeld);
		miscReturn=computeMisc(expenses, misc);
		return federalReturn+stateReturn+miscReturn;
		
	}

}
