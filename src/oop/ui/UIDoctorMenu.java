package oop.ui;

import java.util.Scanner;

public class UIDoctorMenu {
	public static void showDoctorMenu() {
		var response = 0;
		do {
			System.out.println("\n\n");
			System.out.println("Doctor");
			System.out.println("Welcome " + UIMenu.doctorLogged.getName());
			System.out.println("1. Add available appointment");
			System.out.println("2. My scheduled appointments");
			System.out.println("0. Logout");

			Scanner sc = new Scanner(System.in);
			response = Integer.parseInt(sc.nextLine());

			switch (response) {
				case 1 -> {
					System.out.println("Show available appointments");
				}
				case 2 -> System.out.println("Option 3");
				case 3 -> UIMenu.showMenu();
			}
		} while (response != 0);
	}

	public static void showAddAvailableAppointmentsMenu() {
		var selectedMonth = 0;
		do {
			System.out.println();
			System.out.println(":: Add available appointment");
			System.out.println(":: Select a month");
			for (int i = 0; i < 3; i++) {
				System.out.println("Write " + (i + 1) + " to select " + UIMenu.MONTHS[i]);
			}
			System.out.println("0. Return");

			Scanner sc = new Scanner(System.in);
			selectedMonth = Integer.parseInt(sc.nextLine());

			if (selectedMonth > 0 && selectedMonth < 4) {
				System.out.println(selectedMonth + " -> " + UIMenu.MONTHS[selectedMonth]);
				System.out.println("Insert the available date: [dd/mm/yyyy]");
				String date = sc.nextLine();
				System.out.println("Your date is: " + date + "\n1. Correct \n2.Change date");
			} else if (selectedMonth == 0) {
				showDoctorMenu();
			}
		} while(selectedMonth != 0);
	}
}
