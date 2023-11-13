package learningjavabook.chapter9;

public class Animator implements Runnable {
	boolean animating = true;
	@Override
	public void run() {
		Integer i = 0;
		while (i < 1000) {
			// move apples one frame
			// repaint
			// pause
			System.out.println("I is: " + i);
			i++;
		}
	}
}

class Hilo {
	public static void main(String[] args) {
		Animator animator = new Animator();
		Thread thread = new Thread(animator);
		thread.start();
	}
}
