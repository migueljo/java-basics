package learningjavabook.chapter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

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
