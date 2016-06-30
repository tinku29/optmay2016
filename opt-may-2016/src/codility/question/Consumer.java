package codility.question;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {

	private BlockingQueue<Event> queue;
	final Lock lock = new ReentrantLock();

	public Consumer(BlockingQueue<Event> queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		System.out.println("Started the Builder");
		try {
			Executor executor = Executors.newCachedThreadPool();
			while (queue.size() > 0) {
				Event event = queue.take();
				executor.execute(new Runnable() {
					@Override
					public void run() {
						if (event.getType() == Event.EventType.SPECIAL_EVENT_TYPE_B) {
							try {
								lock.lock();
								processEvents(event);
							} finally {
								lock.unlock();
							}
						} else {
							processEvents(event);
						}
						System.out.printf("[%s] consumed event : %s %n", "Executor Thread", event.toString());
					}
				});

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void processEvents(Event pr) {
		System.out.println("The build process BEGINS for" + pr.toString());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The build process ENDS for" + pr.toString());
	}

}
