package learningjavabook.chapter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloJava2");
		String label = args.length > 0 ? args[0] : "Hello world again :)";

		frame.add(new HelloComponent2(label));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
	String message;
	int messageX = 125;
	int messageY = 95;

	public HelloComponent2(String message) {
		this.message = message;
		this.addMouseMotionListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawString(message, messageX, messageY);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.messageX = e.getX();
		this.messageY = e.getY();
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {}
}
