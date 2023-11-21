package learningjavabook.chapter9;

public class URLDemo {
	public static void main(String[] args) {
		int count = 30;
		URLQueue queue = new URLQueue();
		URLProducer p1 = new URLProducer("P1", count, queue);
		URLProducer p2 = new URLProducer("P2", count, queue);
		URLConsumer c1 = new URLConsumer("C1", queue);
		URLConsumer c2 = new URLConsumer("C2", queue);
		System.out.println("Starting...");
		p1.start();
		p2.start();
		c1.start();
		c2.start();

		try {
			// Waiti for the producers to finish creating urls
			p1.join();
			p2.join();
		} catch(InterruptedException ie) {
			System.err.println("Interrupted waiting for producer to finish");
		}
		c1.setKeepWorking(false);
		c2.setKeepWorking(false);
	}
}
