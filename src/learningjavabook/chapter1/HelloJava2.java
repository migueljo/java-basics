package learningjavabook.chapter1;

import javax.swing.*;

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
