package codility.question;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EnhancedProducerConsumer {

	private static final int CAPACITY = 10;

	public static void main(String[] args) {
		 final BlockingQueue<Event> queue = new LinkedBlockingQueue<Event>(CAPACITY);


	        new Thread(new Producer(queue, Event.EventType.A), "Event A").start();
	        new Thread(new Producer(queue, Event.EventType.SPECIAL_EVENT_TYPE_B), "Event B").start();
	        new Thread(new Producer(queue, Event.EventType.C), "Event C").start();

	        new Thread(new Consumer(queue),"Builder").start();

	}

}
