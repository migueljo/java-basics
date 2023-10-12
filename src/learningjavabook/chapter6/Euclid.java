package learningjavabook.chapter6;

public class Euclid {
	public static void main(String[] args) {
		int a = 2701;
		int b = 222;
		// Only try to parse arguments if we have exactly 2
		if (args.length == 2) {
			try {
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
			} catch (Exception e) {
				System.out.println("Arguments were not both numbers. Using  defaults.");
			}
		} else {
			System.out.println("Wrong number of arguments (expected 2). Using defaults.");
		}
		System.out.println("The GCD of " + a + " and " + b + " is: " + getGCD(a, b));
	}

	static int getGCD(int a, int b) {
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
