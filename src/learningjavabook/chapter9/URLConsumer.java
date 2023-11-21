package learningjavabook.chapter9;

import java.util.Random;

public class URLConsumer extends Thread{
	String consumerID;
	URLQueue queue;
	boolean keepWorking;
	Random delay;

	URLConsumer(String id, URLQueue queue) {
		if (queue == null) {
			throw new IllegalArgumentException("Shared queue must not be null");
		}
		consumerID = id;
		this.queue = queue;
		keepWorking = true;
		delay = new Random();
	}
}
