package learningjavabook.chapter6;

public class Exceptions {
	public static void main(String[] args) {
		try {
			if (3 == 3) {
				throw new ParseException();
			}
		} catch (ParseException e) {
			System.out.println("ParseException caught");
		}
	}
}

class ParseException extends Exception {
	private int lineNumber;
	ParseException() {
		super();
		this.lineNumber = -1;
	}
	ParseException(String description, int lineNumber) {
		super(description);
		this.lineNumber = lineNumber;
	}
	public int getLineNumber() {
		return lineNumber;
	}
}
