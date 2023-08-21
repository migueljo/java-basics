package oop.ui;

import java.util.Scanner;

public class UIPatientMenu {
	public static void showPatientMenu() {
		var response = 0;
		do {
			System.out.println("Patient menu");
			System.out.println("Welcome: " + UIMenu.patientLogged.getName());
			System.out.println("1. Book an appointment");
			System.out.println("2. My appointments");
			System.out.println("0. Return");

			Scanner sc = new Scanner(System.in);
			response = Integer.parseInt(sc.nextLine());

			switch (response) {
				case 1 -> System.out.println("1");
				case 2 -> System.out.println("2");
				case 0 -> UIMenu.showMenu();
			}
		} while(response != 0);
	}

	private static void showBookAppointmentMenu() {
		var response = 0;
		do {
			System.out.println(":: Book an appointment");
			System.out.println(":: Select a date");
		} while (response != 0);
	}
}
