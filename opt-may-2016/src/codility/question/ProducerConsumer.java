package codility.question;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import codility.question.Event.EventType;

public class ProducerConsumer {
	
	private static final String SPECIAL_EVENT_TYPE_B = "B";
	private static int CAPACITY = 10;

	public static void main(String[] args) {
		final BlockingQueue<Event> queue = new LinkedBlockingQueue<Event>(CAPACITY);
		 final Lock lock = new ReentrantLock();
		Thread eventSchedulerAlpha = new Thread("Event A") {

			public void run() {

				try {
					Event event = new Event(EventType.A);
					queue.put(event);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		eventSchedulerAlpha.start();
		
		Thread eventSchedulerBeta = new Thread("Event B") {

			public void run() {

				try {
					Event event = new Event(EventType.SPECIAL_EVENT_TYPE_B);
					queue.put(event);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		eventSchedulerBeta.start();
		
		Thread eventSchedulerKappa = new Thread("Event C") {

			public void run() {

				try {
					Event event = new Event(EventType.C);
					queue.put(event);
					// thread will block here
					System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event.toString());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		eventSchedulerKappa.start();
		
			
			Thread builder = new Thread("Builder") {
				public void run() {
					System.out.println("Started the Builder");
					try {
						Event processPR = null;
						while(queue.size()>0) {
							
							Event pr = queue.peek();
							if(pr!=null && SPECIAL_EVENT_TYPE_B.equals(pr.getType())) {
								lock.lock();
								processPR = queue.take();
								processEvents(processPR);
								lock.unlock();
							} else {
								processPR = queue.take();
								processEvents(processPR);
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
	
	public static void processEvents(Event pr) {
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
