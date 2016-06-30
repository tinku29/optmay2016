package codility.question;

import java.util.concurrent.BlockingQueue;

import codility.question.Event.EventType;

public class Producer implements Runnable {

	private BlockingQueue<Event> queue;
	private Event.EventType eventType;

	@Override
	public void run() {
		try {
			Event event = new Event(eventType);
			queue.put(event);
			// thread will block here
			System.out.printf("[%s] published event : %s %n", Thread.currentThread().getName(), event.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public Producer(BlockingQueue<Event> queue, EventType eventType) {
		super();
		this.queue = queue;
		this.eventType = eventType;
	}

}
