package learningjavabook.chapter4;

import java.awt.*;

public class Arrays {
	public static void main(String[] args) {
		int arrayOfInts[]; // c styled
		int[] arrayOfInts2; // preferred
		String[] someStrings;
		Button[] someButtons;

		arrayOfInts = new int[42];
		int number = 3;
		someStrings = new String[number + 2];
		double[] someNumbers = new double[23];
		Component[] components = new Component[2];

		for (int i = 0; i < someNumbers.length; i++) {
			System.out.println("Double: " + someNumbers[i]);
		}

		String names [] = new String [4]; names [0] = new String();
		names [1] = "Walla Walla";
		names [2] = someStrings.toString();
		// names[3] == null

		int[] primes = { 2, 3, 5, 7, 7+4 }; // C-style arrays

		String[] verbs = {"Saltar", "Cocinar"};
		Button[] buttons = {new Button("stop")};
		Object[] random = {2.3, "Miguel", new Button("start")};

		// The following 2 assignments are equivalent
		Button [] threeButtons = new Button [3];
		Button [] threeButtons2 = { null, null, null };
	}
}
