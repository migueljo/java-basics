package learningjavabook.chapter1;

import javax.swing.*;
import java.awt.*;

public class HelloComponent extends JComponent {
	@Override
	protected void paintComponent(Graphics g) {
		g.drawString("Hello, Java :)", 125, 95);
	}
}
