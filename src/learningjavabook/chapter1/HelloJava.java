package learningjavabook.chapter1;

import javax.swing.*;
import java.awt.*;

public class HelloJava {
	public static void main(String[] args) {
		JFrame frame = new javax.swing.JFrame("Hello Java!");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		var width = 300;
		var height = 300;
		int x = (screenSize.width / 2) - (width / 2);
		int y = (screenSize.height / 2) - (height / 2);
		Rectangle frameBounds = new Rectangle(x, y, width, height);

		frame.add(new HelloComponent());
		frame.setBounds(frameBounds);
		frame.setVisible(true);
	}
}
