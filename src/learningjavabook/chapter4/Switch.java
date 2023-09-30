package learningjavabook.chapter4;

public class Switch {
	public static void main(String[] args) {
		var size = getSize();
		var sizeString = switch (size) {
			case 1, 2, 3 -> "small";
			default -> "unknown";
		};
		System.out.println("Your size is: " + sizeString);
	}

	static Integer getSize() {
		return 1;
	}
}
