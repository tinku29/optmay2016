package com.bincy.threading;

public class Builder {
	
	private PullRequest pr;

	public Builder(PullRequest pr) {
		super();
		this.pr = pr;
	}

	public void build(PullRequest pr) throws InterruptedException {
		System.out.println("Received a Pull Request Build for "+pr.toString());
		System.out.println("STARTS the build job at "+System.currentTimeMillis());
		Thread.sleep(3000);
		System.out.println("FINISHED the build job at "+System.currentTimeMillis());
		
	}

}
