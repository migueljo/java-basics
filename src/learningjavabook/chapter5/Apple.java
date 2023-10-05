package learningjavabook.chapter5;

public class Apple {
	float mass;
	private float diameter = 1.0f;
	int x, y;
	boolean isTouching(Apple other) {
		double xdiff = this.x - other.x;
		double ydiff = this.y - other.y;
		double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);

		return distance < ((diameter / 2) + (other.diameter / 2));
	}

	public void printDetails() {
		System.out.println("Apple details:");
		System.out.println("  mass: " + this.mass);
		System.out.println("  diameter: " + this.diameter);
		System.out.println("  position: (" + this.x + ", " + this.y +")");
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
}
