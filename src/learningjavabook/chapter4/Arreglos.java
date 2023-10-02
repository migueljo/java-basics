package learningjavabook.chapter4;

import java.awt.*;
import java.util.Arrays;

public class Arreglos {
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

		String names [] = new String [4];
		names [0] = new String();
		names [1] = "Walla Walla";
		names [2] = someStrings.toString();

		int[] primes = { 2, 3, 5, 7, 7+4 }; // C-style arrays

		String[] verbs = {"Saltar", "Cocinar"};
		Button[] buttons = {new Button("stop")};
		Object[] random = {2.3, "Miguel", new Button("start")};

		// The following 2 assignments are equivalent
		Button [] threeButtons = new Button [3];
		Button [] threeButtons2 = { null, null, null };

		Button[] keypad = new Button[10];
		for (int i = 0; i < keypad.length; i++) {
			keypad[i] = new Button(Integer.toString(i));
		}

		// System.arraycopy
		String[] tmpVar = new String[2 * names.length];
		System.arraycopy(names, 0, tmpVar, 0, names.length);

		for (String variable : tmpVar) {
			System.out.println("Copied value: " + variable);
		}
		// java.util.Arreglos.copyOf
		byte[] bar = new byte[] {1, 2, 3, 4, 5};
		byte[] barCopy = Arrays.copyOf(bar, bar.length);
		System.out.println("Numbers: " + join(barCopy));
		byte[] expanded = Arrays.copyOf(bar, bar.length + 2);
		System.out.println("Expanded: " + join(expanded));

		byte[] firstThree = Arrays.copyOfRange(bar, 0, 3);
		System.out.println("Range from 0 to 3: " + join(firstThree));

		byte[] lastNumbers = Arrays.copyOfRange(bar, 2, bar.length);
		System.out.println("Last numbers: " + join(lastNumbers));

		byte[] lastNumbersPlus2 = Arrays.copyOfRange(bar, 2, bar.length + 2);
		System.out.println("Last numbers plus 2: " + join(lastNumbersPlus2));
	}

	static String join(byte[] numbers) {
		String barString = "";
		for (byte n: numbers) {
			barString += " " + n;
		}
		return barString.trim();
	}
}
