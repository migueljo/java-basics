package learningjavabook.chapter8;

import java.util.Arrays;

public class RegExp {
	public static void main(String[] args) {
		escapedChars();
		wordCharacter();
		customClasses();
	}

	static void escapedChars() {
		String text = "A\\B\\C\\D\\E";
		// Actual regexp "\"
		String[] letters = text.split("\\\\");
		System.out.println(text);
		for (String letter : letters) {
			System.out.println(letter);
		}
	}

	static void wordCharacter() {
		String text = "Yo tengo 28 años, pero parece que tengo más? _ :) _ @";
		System.out.println(Arrays.toString(text.split("\\w")));
	}

	static void customClasses() {
		String text = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("First 5 letters: " + Arrays.toString(text.split("[abcde]")));
		System.out.println("All letters: " + Arrays.toString(text.split("[a-z]")));
	}
}
