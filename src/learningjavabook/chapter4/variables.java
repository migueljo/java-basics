package learningjavabook.chapter4;

public class variables {
	public static void main(String[] args) {
		int foo = 42;
		double d1 = 3.14, d2 = 2 * d1;
		boolean isFun = true;

		int i = 1230;
		// Binary numbers begin with 0b or 0B
		int binary = 0b01001011; // 75 in decimal
		// Octal numbers begin with 0
		int octal = 01230; // 664 in decimal
		// Hexadecimal numbers begin with 0x OR 0X
		int hexadecimal = 0xFFFF; // 65535 in decimal

		// Long numbers
		long l = 13L;
		l = 13;
		l = 40000000000L;

		// Promotion
		byte b = 42;
		int integer = 43;
		int result = b * integer; // b is promoted to int before multiplication

		// Down promoting
		// byte b2 = integer; // Error
		int integer2 = 10000;
		byte b2 = (byte) integer2;
		System.out.println(b2);

		// _ separator
		int RICHARD_NIXONS_SSN = 567_68_0515;
		int for_no_reason = 1___2___3;
		int JAVA_ID = 0xCAFE_BABE;
		long grandTotal = 40_123_456_789L;
		System.out.println(RICHARD_NIXONS_SSN + ", " + for_no_reason + ", " + JAVA_ID + ", " + grandTotal);

		// Floating point literals
		double doubleN = 8.31;
		double e = 3.00e+8;
		float f = 8.31F;
		float g = 3.00e+8F;
		float pi = 3.14_159_265_358f;

		// Character literals
		char a = 'a';
		char newline = '\n';
		char smiley = '\u263a';
		System.out.println(a + "" + newline + smiley);
	}
}
