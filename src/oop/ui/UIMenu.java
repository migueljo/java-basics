package oop.ui;

import oop.model.Doctor;
import oop.model.Patient;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UIMenu {
	final public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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
				case 1 -> {
					System.out.println("::Book an appointment");
					for (int i = 0; i < 4; i++) {
						System.out.println(i + ". " + MONTHS[i]);
					}
				}
				case 2 -> System.out.println("::My appointments");
				case 0 -> showMenu();
			}
		} while (response != 0);
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
				case 1 -> {
					response = 0;
					System.out.println("Doctor");
					authUser(1);
				}
				case 2 -> {
					response = 0;
					System.out.println("Patient");
					authUser(2);
				}
				case 0 -> System.out.println("Thank you for you visit");
				default -> System.out.println("Please select a correct answer");
			}
		} while (response != 0);
	}

	private static void authUser(int userType) {
		// userType = 1 -> Doctor
		// userType = 2 -> Patient
		var DOCTOR = 1;
		var PATIENT = 2;


		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor("Miguel Martínez", "m@m.com", "Neurología"));
		doctors.add(new Doctor("Andrés Martínez", "c@c.com", "Pediatra"));
		doctors.add(new Doctor("Carolina Martínez", "c@c.com", "Oncología"));

		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient("Julian", "j@j.com"));
		patients.add(new Patient("Alvaro", "a@a.com"));
		patients.add(new Patient("Federico", "f@f.com"));

		boolean emailCorrect = false;

		do {
			System.out.println("Insert your email: [a@a.com]");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			if (userType == DOCTOR) {
				for (Doctor doctor: doctors) {
					if (Objects.equals(doctor.getEmail(), email)) {
						emailCorrect = true;
						break;
					}
				}
			} else if (userType == PATIENT) {
				for (Patient patient : patients) {
					if (Objects.equals(patient.getEmail(), email)) {
						emailCorrect = true;
						break;
					}
				}
			}
		} while(!emailCorrect);
	}
}
