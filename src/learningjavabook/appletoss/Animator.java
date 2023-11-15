package learningjavabook.appletoss;

public class Animator implements Runnable {
	public static final int STEP = 40; // duration of an animation frame in milliseconds
	boolean animating = true;
	@Override
	public void run() {
		while (animating) {
			// "animating" is a global variable that allows us to stop animating
			// and conserve resources if there are no active apples to move
			while (animating) {
				System.out.println("Stepping " + apples.size() + " apples");
				for (Apple a : apples) {
					a.step();
					detectCollisions(a);
				}
				Field.this.repaint();
				cullFallenApples();
				try {
					Thread.sleep((int)(STEP * 1000));
				} catch (InterruptedException ie) {
					System.err.println("Animation interrupted");
					animating = false;
				}
			}
		}
	}
}
