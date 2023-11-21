package learningjavabook.chapter9;

import java.util.Random;

public class URLProducer {
	String producerID;
	int urlCount;
	URLQueue queue;
	Random delay;

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
