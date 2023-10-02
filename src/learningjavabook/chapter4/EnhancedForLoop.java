package learningjavabook.chapter4;

import java.util.ArrayList;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int [] intsArray = new int[] {10, 20, 30, 40, 50, 60};
		for(int number: intsArray) System.out.println("Number: " + number);

		ArrayList<Integer> intsArrayList = new ArrayList();
		intsArrayList.add(70);
		intsArrayList.add(80);
		for(Integer number: intsArrayList) System.out.println("Number: " + number);

		int i, j;
		i = 5; // Assignment is an expression and a statement
		j = (i = 7);
		System.out.println(i + " : " + j);
	}
}
