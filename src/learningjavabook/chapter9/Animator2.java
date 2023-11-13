package learningjavabook.chapter9;

public class Animator2 extends Thread {
	boolean animating = true;
	@Override
	public void run() {
		Integer i = 0;
		while (i < 1000) {
			// move apples one frame
			// repaint
			// pause
			System.out.println("Animator2: I is: " + i);
			i++;
		}
	}
}

class Hilo2 {
	public static void main(String[] args) {
		Animator2 bouncy = new Animator2();
		bouncy.start();
	}
}
