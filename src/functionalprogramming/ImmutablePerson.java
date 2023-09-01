package functionalprogramming;

import java.util.LinkedList;
import java.util.List;

public final class ImmutablePerson {
	private final String firstName;
	private final String lastName;
	private final List<String> emails;
	public ImmutablePerson(String firstName, String lastName, List<String> emails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emails = emails;
	}

	public String getFirstName() { return firstName;}

	public String getLastName() { return lastName; }

	public final List<String> getEmail() { return new LinkedList<>(emails); }

	@Override
	public String toString() {
		return "First name: " + firstName + ", Last name: " + lastName + ", Emails: " + emails;
	}
}
