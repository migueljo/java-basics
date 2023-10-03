package learningjavabook.chapter5;

public class Apple {
	float mass;
	float diameter = 1.0f;
	int x, y;
	boolean isTouching(Apple other) {
		return true;
	}

	public void printDetails() {
		System.out.println("Apple details:");
		System.out.println("  mass: " + this.mass);
		System.out.println("  diameter: " + this.diameter);
		System.out.println("  position: (" + this.x + ", " + this.y +")");
	}
}
