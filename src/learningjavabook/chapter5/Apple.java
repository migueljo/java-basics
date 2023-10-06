package learningjavabook.chapter5;

public class Apple {
	final static float EARTH_ACCELERATION = 9.8f;
	static int SMALL = 0, MEDIUM = 1, LARGE = 2;
	float mass;
	private float diameter = 1.0f;
	int x, y;

	float getWeight() {
		return mass * EARTH_ACCELERATION;
	}

	public void moveTo(int x, int y) {
		System.out.println("Moving apple to x = " + x + ", y = " + y);
		this.x = x;
		if (y > diameter / 2) {
			this.y = y;
		} else {
			this.y = (int)(diameter / 2);
		}
	}

	public static String[] getAppleSizes() {
		return new String[] { "SMALL", "MEDIUM", "LARGE" };
	}

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
