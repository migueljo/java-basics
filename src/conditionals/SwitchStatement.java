package conditionals;

public class SwitchStatement {
	public static void main(String[] args) {
		var colorModeSelected = "dark";
		switch (colorModeSelected) {
			case "light" -> System.out.println("Light mode");
			case "dark" -> System.out.println("Dark mode");
			case "blue dark" -> System.out.println("Blue dark mode");
			default -> System.out.println("No mode selected");
		}
	}
}
