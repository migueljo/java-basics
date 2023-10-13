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
		// tryFinally();
		tryCatchFinally();
	}

	void myMethod() {
		int foo;
		try {
			foo = 4;
		} catch (Exception e) {
		}
		// System.out.println(foo); foo can't be used here because it may not have been initialized due to the try catch block
	}

	void myMethod2() {
		int foo;
		try {
			foo = 4;
		} catch (Exception e) {
			return;
		}
		System.out.println(foo); // This is ok because of the return statement inside the catch block
	}

	static void tryFinally() {
		try {
			System.out.println("Inside try block");
			return;
		} finally {
			System.out.println("Inside finally block");
		}
	}

	static void tryCatchFinally() {
		try {
			System.out.println("Inside try block");
			if (3 == 3) {
				throw new Exception("Testing try catch finally");
			}
		} catch (Exception e) {
			System.out.println("Catch block: " + e.getMessage());
			return;
		} finally {
			System.out.println("Inside finally block...");
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
