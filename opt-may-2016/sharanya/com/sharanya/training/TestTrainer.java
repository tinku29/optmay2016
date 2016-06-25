package com.sharanya.training;

public class TestTrainer {

	public static void main(String[] args) {
		Trainer trainer=new Trainer();
		trainer.setCourseDuration(8);
		trainer.setBatch(2016);
		System.out.println("Car model"+trainer.getCourseDuration());
		System.out.println("Car Speed"+trainer.getBatch());
	}

}
