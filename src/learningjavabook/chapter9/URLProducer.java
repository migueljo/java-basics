package learningjavabook.chapter9;

import java.util.Random;

public class URLProducer extends Thread {
	String producerID;
	int urlCount;
	URLQueue queue;
	Random delay;

	URLProducer(String id, int count, URLQueue queue) {
		if (count <= 0) {
			throw new IllegalArgumentException("Count must be positive");
		}
		if (queue == null) {
			throw new IllegalArgumentException("Shared queue must not be null");
		}

		producerID = id;
		urlCount = count;
		this.queue = queue;
		delay = new Random();
	}

	public void run() {
		for (int i = 0; i < urlCount; i++) {
			String url = "https://some.url/at/path/" + i;
			queue.addURL(producerID + " " + url);
			System.out.println(producerID + " produced " + url);
			try {
				Thread.sleep(delay.nextInt(500));
			} catch (InterruptedException e) {
				System.err.println("Producer " + producerID + " interrupted. Quitting");
				break;
			}
		}
	}
}
