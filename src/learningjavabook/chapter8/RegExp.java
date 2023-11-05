package learningjavabook.chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class RegExp {
	public static void main(String[] args) {
		escapedChars();
		wordCharacter();
		customClasses();
		repetition();
	}

	static void repetition() {
		ArrayList<String> anys = new ArrayList<>();
		anys.add("01");
		anys.add("001");
		anys.add("0001");
		anys.add("1");
		anys.add("011");
		for (String v : anys) {
			String regex = "0*\\d";
			System.out.println("Any -> " + v + " matches " + regex + " ? " + v.matches(regex));
		}
		System.out.println("-----------------------------------");

		ArrayList<String> somes = new ArrayList<>();
		somes.add("01");
		somes.add("001");
		somes.add("0001");
		somes.add("1");
		for (String v : somes) {
			String regex = "0+\\d";
			System.out.println("Some -> " + v + " matches " + regex + " ? " + v.matches(regex));
		}
		System.out.println("-----------------------------------");

		ArrayList<String> optionals = new ArrayList<>();
		optionals.add("0000");
		optionals.add("000/0");
		optionals.add("11111");
		for (String v : optionals) {
			String regex = "\\d\\d\\d/?\\d";
			System.out.println("Optional -> " + v + " matches " + regex + " ? " + v.matches(regex));
		}
		System.out.println("-----------------------------------");
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
