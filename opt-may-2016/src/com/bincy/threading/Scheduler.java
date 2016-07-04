package com.bincy.threading;

public class Scheduler {
	
	private PullRequest pr;
	
	public Scheduler(PullRequest pr) {
		super();
		this.pr = pr;
	}

	
	public PullRequest getPr() {
		return pr;
	}

	public void setPr(PullRequest pr) {
		this.pr = pr;
	}

	public void schedule(PullRequest pr) throws InterruptedException {
		System.out.println("Received a Pull Request Build for "+pr.toString());
		System.out.println("SCHEDULE job at "+System.currentTimeMillis());
		
	}

}
