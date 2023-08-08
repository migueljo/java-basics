package functions;

public class Functions {
	public static void main(String[] args) {
		System.out.println(circleArea(3));
		System.out.println(sphereArea(3));
		System.out.println(sphereVolume(4));

		System.out.println(toDollar(3228, "COP"));
	}

	public static double circleArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	public static double sphereArea(double radio) {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

	public static double sphereVolume(double radio) {
		return (4/3) * Math.PI * Math.pow(radio, 3);
	}

	public static double toDollar(double quantity, String currency) {
		switch (currency) {
			case "MXN" -> quantity *= 0.052;
			case "COP" -> quantity *= 0.00031;
		}
		return quantity;
	}
}
