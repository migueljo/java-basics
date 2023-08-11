package oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Carolina Martínez");
		Doctor myDoctor2 = new Doctor("Andrés Martínez");
		myDoctor.showName();
		myDoctor.showId();
		myDoctor2.showId();
	}

	public static void showMenu(){
		System.out.println("Welcome to My Appointments");
		System.out.println("Selecciona la opción deseada");

		int response = 0;
		do {
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Salir");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 1 -> System.out.println("Doctor");
				case 2 -> {
					response = 0;
					showPatientMenu();
				}
				case 0 -> System.out.println("Thank you for you visit");
				default -> System.out.println("Please select a correct answer");
			}
		}while (response != 0);
	}

	public static void showPatientMenu(){
		int response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Patient");
			System.out.println("1. Book an appointment");
			System.out.println("2. My appointments");
			System.out.println("0. Return");

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 1 -> System.out.println("::Book an appointment");
				case 2 -> System.out.println("::My appointments");
				case 0 -> showMenu();
			}
		}while (response != 0);
	}
}
