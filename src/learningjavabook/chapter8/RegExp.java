package learningjavabook.chapter8;

public class RegExp {
	public static void main(String[] args) {
		escapedChars();
	}

	static void escapedChars() {
		String text = "A\\B\\C\\D\\E";
		String[] letters = text.split("\\\\");
		System.out.println(text);
		for (String letter : letters) {
			System.out.println(letter);
		}
	}
}
