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

	public void run() {
		while (keepWorking || !queue.isEmpty()) {
			String url = queue.getURL();
			if (url != null) {
				System.out.println(consumerID + " consumed " + url);
			} else {
				System.out.println(consumerID + " skipped empty queue");
			}
			try {
				Thread.sleep(delay.nextInt(500));
			} catch (InterruptedException ie) {
				System.err.println("Consumer" + consumerID + "interrupted. Quitting.");
				break;
			}
		}
	}
}
