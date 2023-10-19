package learningjavabook.chapter7;

import javax.swing.*;
import java.util.ArrayList;

public class Containers {
	public static void main(String[] args) {
		ArrayList things = new ArrayList<>();
		things.add("Hi there");
		things.add(new JLabel("Hi there"));
		System.out.println(things);
	}
}
