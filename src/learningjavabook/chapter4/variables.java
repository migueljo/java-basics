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
	}
}
