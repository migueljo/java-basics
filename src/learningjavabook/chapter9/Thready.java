package learningjavabook.chapter9;


public class Thready {
	public static void main( String args [] ) {
		new ShowThread("Foo").start();
		new ShowThread("Bar").start();
	}

	static class ShowThread extends Thread {
		String message;
		ShowThread(String message) {
			this.message = message;
		}
		public void run() {
			while (true) {
				System.out.println(message);
			}
		}
	}
}