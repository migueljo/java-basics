package learningjavabook.chapter8;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Strings {
	public static void main(String[] args) {
		String quote = "To be or not to be";
		int quoteLength = quote.length();
		boolean isQuoteEmpty = quote.isEmpty();

		String name = "Miguel " + "Martínez";
		String name2 = "Miguel".concat(" Martínez");

		String multiline = """
      Twas brillig, and the slithy toves
      Did gyre and gimble in the wabe:
      All mimsy were the borogoves,
      And the mome raths outgrabe.
    """;

		char[] nameAsArray = new char[] {'M', 'i', 'g', 'u', 'e', 'l'};
		String nameAsString = new String(nameAsArray);
		System.out.println(nameAsString);

		byte[] stringBytes = new byte[] {(byte)97, (byte)98, (byte)99};
		String bytesAsString = new String(stringBytes);
		System.out.println(bytesAsString);

		String scientist = "Newton";
		for (int i = 0; i < scientist.length(); i++) {
			System.out.println(scientist.charAt(i));
		}

		String one = String.valueOf(1);
		String two = String.valueOf(2.384f);
		String notTrue = String.valueOf(false);
		System.out.println(one + ", " + two + ", " + notTrue);

		Date date = new Date();
		String d1 = String.valueOf(date);
		String d2 = date.toString();
		System.out.println(d1 + ", " + d2);
		date = null;
		d1 = String.valueOf(date); // null
		// d2 = date.toString(); // NullPointerException
		String today = "Today's date is: " + new Date();
		System.out.println(today);

		String two2 = "" + 2.384f;
		String today2 = "" + new Date();

		compareStrings();
		searching();
		parsing();
		tokenizing();
	}

	static void tokenizing() {
		String text = "Now is the time for all good men";
		String[] words = text.split(" ");
		System.out.println(Arrays.toString(words));

		String text2 = "4231,         Java Programming, 1000.00";
		String[] fields = text2.split("\\s*,\\s*");
		System.out.println(Arrays.toString(fields));

		String text3 = "4231,         Java Programming, 1000.00";
		Scanner scanner = new Scanner(text3).useDelimiter("\\s*,\\s*");
		int checkNumber = scanner.nextInt();
		String description = scanner.next();
		float amount = scanner.nextFloat();
		System.out.println("**** Data ****\n" + "Number: " + checkNumber + "\nDescription: " + description + "\nAmount: " + amount + "\n**** Data ****");

		String text4 = "Now is the time for all good men (and women)...";
		StringTokenizer stringTokenizer = new StringTokenizer(text4);
		while (stringTokenizer.hasMoreTokens()) {
			String word = stringTokenizer.nextToken();
			System.out.println("Token word: " + word);
		}

		String text5 = "4231,     Java Programming, 1000.00";
		StringTokenizer stringTokenizer1 = new StringTokenizer(text5, ",");
		while (stringTokenizer1.hasMoreTokens()) {
			String word = stringTokenizer1.nextToken();
			System.out.println("Token word 2:" + word);
		}
	}

	static void compareStrings() {
		String one = "ONE";
		String one1 = "one";
		System.out.println("Case sensitive equals? " + one.equals(one1));
		System.out.println("Case insensitive equals? " + one.equalsIgnoreCase(one1));

		String foo = "foo";
		String foo1 = String.valueOf(new char[] {'f', 'o', 'o'});
		System.out.println("Comparing with == :: " + String.valueOf(foo == foo1));
		System.out.println("Comparing with equals :: " + foo.equals(foo1));

		String abc = "abc";
		String def = "def";
		String num = "123";
		System.out.println(abc.compareTo(def) < 0);
		System.out.println(abc.compareTo( abc ) == 0);
		System.out.println(abc.compareTo( num ) > 0);
	}

	static void searching() {
		String url = "https://google.com";
		System.out.println("Is it secure? " + url.startsWith(url));
		System.out.println("Is it .com? " + url.endsWith(url));

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int i1 = alphabet.indexOf("a");
		int i2 = alphabet.indexOf("def");
		int i3 = alphabet.indexOf("abfd");
		System.out.println(i1 + ", " + i2 + ", " + i3);

		System.out.println("Last index of: " + alphabet.lastIndexOf("abc"));

		String log = "There is an emergency in sector 7!";
		if (log.contains("emergency")) {
			System.out.println("Call someone");
		}
		if (log.indexOf("emergency") != -1) System.out.println("Call someone 2");
	}
	static void parsing() {
		byte b = Byte.parseByte("16");
		int n = Integer.parseInt("42");
		long l = Long.parseLong("999999999");
		float f = Float.parseFloat("4.3");
		double d = Double.parseDouble("99.9999999");
		boolean boolean1 = Boolean.parseBoolean("true");

		byte b2 = new Scanner("16").nextByte();
		int n2 = new Scanner("42").nextInt();
		long l2 = new Scanner("999999").nextLong();
		float f2 = new Scanner("4.3").nextFloat();
		double d2 = new Scanner("99.9999999").nextDouble();
		boolean boolean2 = new Scanner("true").nextBoolean();

		System.out.println(b2 + ", " + n2 + ", " + l2 + ", " + f2 + ", " + d2 + ", " + boolean2);
	}
}
