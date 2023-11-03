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
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String allLettersAndNumbers = alphabet + numbers;
		System.out.println("First 5 letters: " + Arrays.toString(alphabet.split("[abcde]")));
		System.out.println("All letters: " + Arrays.toString(alphabet.split("[a-z]")));
		System.out.println("Zero letters: " + Arrays.toString(alphabet.split("[A-Z]")));
		System.out.println("All letters and numbers" + Arrays.toString(allLettersAndNumbers.split("[a-z0-9]")));
		System.out.println("Match al numbers after 5 to 9:" + Arrays.toString(numbers.split("[^0-5]")));
		System.out.println("Composing range and 1 character " + Arrays.toString(numbers.split("[0-59]")));
	}
}
