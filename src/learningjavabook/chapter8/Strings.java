package learningjavabook.chapter8;

public class Strings {
	public static void main(String[] args) {
		String quote = "To be or not to be";
		int quoteLength = quote.length();
		boolean isQuoteEmpty = quote.isEmpty();

		String name = "Miguel " + "Martínez";
		String name2 = "Miguel".concat(" Martínez");
	}
}
