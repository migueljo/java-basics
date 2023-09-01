package functionalprogramming;

import java.util.LinkedList;
import java.util.List;

public class Outsider {
	public static void main(String[] args) {
		String firstName = "Miguel";
		String lastName = "Martínez";
		LinkedList<String> emails = new LinkedList<>();
		emails.add("m@m.com");
		emails.add("m2@m.com");

		ImmutablePerson miguel = new ImmutablePerson(firstName, lastName, emails);
		System.out.println(miguel);
		badFunction(miguel);
		System.out.println(miguel);
	}

	static void badFunction(ImmutablePerson person) {
		List<String> emails = person.getEmails();
		emails.clear();
		emails.add("spam@gmail.com");
	}
}
