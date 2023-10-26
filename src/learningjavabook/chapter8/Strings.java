package learningjavabook.chapter8;

import java.util.Date;

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
	}
}
