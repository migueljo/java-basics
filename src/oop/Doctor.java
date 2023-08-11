package oop;

import javax.print.Doc;

public class Doctor {
	static int id = 0; // auto-incremented
	private int instanceId;
	String name;
	String speciality;

	Doctor() {
		System.out.println("Building doctor object");
		this.instanceId = Doctor.id;
		Doctor.id++;
	}

	Doctor(String name) {
		this.name = name;
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
