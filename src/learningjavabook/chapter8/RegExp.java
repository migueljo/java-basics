package learningjavabook.chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args) {
		escapedChars();
		wordCharacter();
		customClasses();
		repetition();
		alternation();
		pattern();
	}

	static void pattern() {
		System.out.println("-----------------------------------");
		System.out.println("Pattern Start");
		String text = """
      https://google.com
      https://youtube.com""";
		String urlRegex = "(?im)\\w+://[\\w/]*.(com|net)";
		Pattern urlPattern = Pattern.compile(urlRegex);
		Matcher matcher = urlPattern.matcher(text);
		if (matcher.find()) {
			System.out.println("Start: " + matcher.start());
			System.out.println("End: " + matcher.end());
			System.out.println("Group: " + matcher.group());
		}

		String sampleEmail = "my.name@some.domain";
		Boolean validEmail = Pattern.matches("[^@]+@[^@]+", sampleEmail);

		System.out.println("Pattern End");
		System.out.println("-----------------------------------");
	}

	static void alternation() {
		System.out.println("-----------------------------------");
		System.out.println("Logical OR");
		ArrayList<String> dates = new ArrayList<>();
		dates.add("Fri, Oct 12, 2001");
		dates.add("10/12/2001");
		dates.add("12 octubre 2023");
		for (String v : dates) {
			String regex = "\\w+, \\w+ \\d+, \\d+|\\d\\d/\\d\\d/\\d+";
			System.out.println("Logical OR | -> " + v + " matches \"" + regex + "\" ? " + v.matches(regex));
		}
		ArrayList<String> emails = new ArrayList<>();
		emails.add("m@m.com");
		emails.add("a@a.gov");
		emails.add("a@a.a.net");
		emails.add("m@.com"); // TODO: Should be false not true
		emails.add("@com");
		for (String v : emails) {
			// \w+@[\w.]*(com|net|edu|gov)
			String regex = "\\w+@[\\w+\\.]+(com|net|edu|gov)";
			System.out.println("Logical OR | -> " + v + " matches \"" + regex + "\" ? " + v.matches(regex));
		}
		System.out.println("-----------------------------------");
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
		System.out.println("Range inclusive");
		ArrayList<String> ranges = new ArrayList<>();
		ranges.add("Holas");
		ranges.add("Caros");
		ranges.add("Motos");
		ranges.add("Televisor");
		for (String v : ranges) {
			String regex = "\\b\\w{5,7}\\b";
			System.out.println("Range -> " + v + " matches " + regex + " ? " + v.matches(regex));
		}

		System.out.println("-----------------------------------");
		System.out.println("Range from x to infinite");
		ArrayList<String> ranges2 = new ArrayList<>();
		ranges2.add("Hola");
		ranges2.add("Caro");
		ranges2.add("Motos");
		ranges2.add("Televisor");
		for (String v : ranges2) {
			String regex = "\\b\\w{5,}\\b";
			System.out.println("Range -> " + v + " matches " + regex + " ? " + v.matches(regex));
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
