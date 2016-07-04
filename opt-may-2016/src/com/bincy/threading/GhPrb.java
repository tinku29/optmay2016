package com.bincy.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GhPrb {
	
	private static int CAPACITY = 10;

	public static void main(String[] args) {
		final BlockingQueue<PullRequest> queue = new LinkedBlockingQueue<PullRequest>(CAPACITY);
		 final Lock aLock = new ReentrantLock();
		Thread prScheduler1 = new Thread("abc PR") {

			public void run() {

				try {
					PullRequest pr = new PullRequest("abc");
					queue.put(pr);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), pr.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		prScheduler1.start();
		
		Thread prScheduler2 = new Thread("xyz PR") {

			public void run() {

				try {
					PullRequest pr = new PullRequest("xyz");
					queue.put(pr);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), pr.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		prScheduler2.start();
		
		Thread prScheduler3 = new Thread("abc PR") {

			public void run() {

				try {
					PullRequest pr = new PullRequest("abc");
					queue.put(pr);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), pr.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		prScheduler3.start();
		
			
			Thread builder = new Thread("Builder") {
				public void run() {
					System.out.println("Started the Builder");
					try {
						PullRequest processPR = null;
						while(queue.size()>0) {
							
							PullRequest pr = queue.peek();
							if(pr!=null && "abc".equals(pr.getRepository())) {
								aLock.lock();
								processPR = queue.take();
								startBuilding(processPR);
								aLock.unlock();
							} else {
								processPR = queue.take();
								startBuilding(processPR);
							}
							// thread will block here
							System.out.printf("[%s] consumed event : %s %n", Thread.currentThread().getName(), pr.toString());
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			builder.start();
			

		
	
	}
	
	public static void startBuilding(PullRequest pr) {
		System.out.println("The build process BEGINS for" + pr.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The build process ENDS for" + pr.toString());
	}

}
