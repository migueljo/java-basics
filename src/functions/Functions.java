package functions;

public class Functions {
	public static void main(String[] args) {
	}

	public double circleArea() {
		double y = 3;
		return Math.PI * Math.pow(y, 2);
	}

	public double sphereArea() {
		double y = 3;
		return 4 * Math.PI * Math.pow(y, 2);
	}

	public double sphereVolume() {
		double y = 3;
		return (4/3) * Math.PI * Math.pow(y, 3);
	}
}
