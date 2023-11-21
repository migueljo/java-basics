package learningjavabook.chapter9;


public class Thready {
	public static void main( String args [] ) {
		Thread foo = new ShowThread("Foo");
		Thread bar = new ShowThread("Bar");
		foo.setPriority(Thread.MIN_PRIORITY);
		bar.setPriority(Thread.MAX_PRIORITY);
		foo.start();
		bar.start();
	}

	static class ShowThread extends Thread {
		String message;
		int counter = 0;
		ShowThread(String message) {
			this.message = message;
		}
		public void run() {
			while (true) {
				System.out.println(message + ": " + counter);
				counter++;
			}
		}
	}
}