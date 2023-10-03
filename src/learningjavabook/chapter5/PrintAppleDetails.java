package learningjavabook.chapter5;

public class PrintAppleDetails {
	public static void main(String[] args) {
		Apple a1 = new Apple();
		System.out.println("Apple a1:");
		System.out.println(" mass: " + a1.mass);
		System.out.println(" diameter: " + a1.diameter);
		System.out.println(" position: (" + a1.x + ", " + a1.y +")");

		a1.mass = 10;
		a1.x = 20;
		a1.y = 40;
		System.out.println("Updated a1:");
		System.out.println("  mass: " + a1.mass);
		System.out.println("  diameter: " + a1.diameter);
		System.out.println("  position: (" + a1.x + ", " + a1.y +")");
	}
}
