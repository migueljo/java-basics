package learningjavabook.chapter7;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hello");

		String number1 = listOfStrings.get(0);
	}
}
