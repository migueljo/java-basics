package oop;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Carolina Martínez");
		Doctor myDoctor2 = new Doctor("Andrés Martínez");
		myDoctor.showName();
		myDoctor.showId();
		myDoctor2.showId();
	}
}
