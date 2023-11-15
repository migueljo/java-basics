package learningjavabook.appletoss;

public class Animator implements Runnable {
	boolean animating = true;
	@Override
	public void run() {
		int i = 0;
		while (i < 1000) {
			// move apples one frame
			// repaint
			// pause
			System.out.println("I is: " + i);
			i++;
		}
	}
}
