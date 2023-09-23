package platzibasic.collections;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		String[] androidVersions = new String[16];
		String days[] = new String[7];
		String[][] cities = new String[4][2];

		int [][][] numbers = new int[10][5][2];
		int [][][][][] n = new int[2][2][2][2][2];

		ArrayList names = new ArrayList();
		names.add("Miguel");
		names.add("Carmen");
		names.add("Miguel A");
		names.add("Andres");
		names.add("Carolina");
		names.add(1290);

		androidVersions[0] = "Apple Pie";
		androidVersions[1] = "Banana bread";
		androidVersions[2] = "Cupcake";
		androidVersions[3] = "Donut";

		for (int i = 0; i < androidVersions.length; i++) {
			System.out.println("Adnroid version: " + androidVersions[i]);
		}
	}
}
