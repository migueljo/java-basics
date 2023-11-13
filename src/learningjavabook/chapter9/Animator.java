package learningjavabook.chapter9;

public class Animator implements Runnable {
	boolean animating = true;
	@Override
	public void run() {
		while (animating) {
			// move apples one frame
			// repaint
			// pause
		}
	}
}
