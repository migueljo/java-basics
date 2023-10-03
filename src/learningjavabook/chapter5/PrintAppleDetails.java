package learningjavabook.chapter5;

public class PrintAppleDetails {
	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.printDetails();

		a1.mass = 10;
		a1.x = 20;
		a1.y = 40;
		a1.printDetails();
	}
}
