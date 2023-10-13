package learningjavabook.chapter6;

public class Exceptions {
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
