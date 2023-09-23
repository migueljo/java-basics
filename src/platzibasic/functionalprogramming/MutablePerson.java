package platzibasic.functionalprogramming;

import java.util.List;

public class MutablePerson {
	private String firstName;
	private String lastName;
	private List<String> emails;
	public MutablePerson() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "First name: " + firstName + ", Last name: " + lastName + ", Emails: " + emails;
	}
}
