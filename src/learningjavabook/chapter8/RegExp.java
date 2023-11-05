package learningjavabook.chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class RegExp {
	public static void main(String[] args) {
		/*
		*escapedChars();
		* wordCharacter();
		* customClasses();
		* */
		repetition();
	}

	static void repetition() {
		ArrayList<String> optionals = new ArrayList<>();
		optionals.add("0000");
		optionals.add("000/0");
		optionals.add("11111");
		for (String o : optionals) {
			String regex = "\\d\\d\\d/?\\d";
			System.out.println("Optional -> " + o + " matches " + regex + " ? " + o.matches(regex));
		}
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
		String arose = """
      A rose is a rose is a rose
      A rose is a rose is a rose
      A rose is a rose is a rose""";
		String roses = "rose rosemary primrose roses";
		String allLettersAndNumbers = alphabet + numbers;
		System.out.println("First 5 letters: " + Arrays.toString(alphabet.split("[abcde]")));
		System.out.println("Match all letters: " + Arrays.toString(alphabet.split("[a-z]")));
		System.out.println("Match zero letters: " + Arrays.toString(alphabet.split("[A-Z]")));
		System.out.println("All letters and numbers" + Arrays.toString(allLettersAndNumbers.split("[a-z0-9]")));
		System.out.println("Match al numbers after 5 to 9: " + Arrays.toString(numbers.split("[^0-5]")));
		System.out.println("Composing range and 1 character: " + Arrays.toString(numbers.split("[0-59]")));
		System.out.println("Logical && AND: " + Arrays.toString(alphabet.split("[a-z&&[^m-p]]"))); // Simplify warning works in another way
		System.out.println("Match at the beginning: " + Arrays.toString(arose.split("^[Aa] rose")));
		System.out.println("Match at the end: " + Arrays.toString(arose.split("[Aa] rose$")));
	}
}
