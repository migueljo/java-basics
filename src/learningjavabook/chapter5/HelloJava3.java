package learningjavabook.chapter5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava3 extends JFrame {
	public static void main(String[] args) {
		HelloJava3 demo = new HelloJava3();
		demo.setVisible(true);
	}

	public HelloJava3() {
		super("Hello Java 3");
		HelloComponent3 text = new HelloComponent3("Hello, Inner Java!");
		add(text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	class HelloComponent3 extends JComponent {
		String theMessage;
		int messageX = 125, messageY = 95;
		public HelloComponent3(String message) {
			theMessage = message;
			addMouseMotionListener(new MouseMotionListener() {
				@Override
				public void mouseDragged(MouseEvent e) {
					messageX = e.getX();
					messageY = e.getY();
					repaint();
				}
				@Override
				public void mouseMoved(MouseEvent e) {}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			g.drawString(theMessage, messageX, messageY);
		}
	}
}
