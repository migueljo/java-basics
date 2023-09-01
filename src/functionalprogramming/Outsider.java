package functionalprogramming;

import java.util.LinkedList;
import java.util.List;

public class Outsider {
	public static void main(String[] args) {
		List<String> miguelEmails = new LinkedList<>();
		miguelEmails.add("m@m.com");

		MutablePerson miguel = new MutablePerson();
		miguel.setEmails(miguelEmails);
		miguel.setFirstName("Miguel");
		miguel.setLastName("Martínez");

		System.out.println(miguel);
		badFunction(miguel);
		System.out.println(miguel);
	}

	static void badFunction(MutablePerson person) {
		List<String> otherEmails = new LinkedList<>();
		otherEmails.add("a@a.com");
		otherEmails.add("a2@a.com");
		person.setEmails(otherEmails);
	}
}
