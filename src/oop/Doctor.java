package oop;

public class Doctor {
	int id;
	String name;
	String speciality;

	Doctor() {
		System.out.println("Building doctor object");
	}

	Doctor(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("Doctor's name is: " + name);
	}
}
