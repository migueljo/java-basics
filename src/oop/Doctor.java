package oop;

public class Doctor {
	static int id = 0; // auto-incremented
	private int instanceId;
	String name;
	String speciality;

	Doctor() {}

	Doctor(String name, String speciality) {
		System.out.println("Building doctor object");
		this.name = name;
		this.speciality = speciality;
		this.instanceId = Doctor.id;
		Doctor.id++;
	}

	public void showName() {
		System.out.println("Doctor's name is: " + name);
	}

	public void showId() {
		System.out.println("The id is: " + this.instanceId);
	}
}
