package oop.ui;

import oop.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
	public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
	public static void showDoctorMenu() {
		var response = 0;
		do {
			System.out.println("Welcome " + UIMenu.doctorLogged.getName());
			System.out.println("1. Add available appointment");
			System.out.println("2. My scheduled appointments");
			System.out.println("0. Logout");

			Scanner sc = new Scanner(System.in);
			response = Integer.parseInt(sc.nextLine());

			switch (response) {
				case 1 -> {
					showAddAvailableAppointmentsMenu();
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
				System.out.println(selectedMonth + " -> " + UIMenu.MONTHS[selectedMonth - 1]);
				System.out.println("Insert the available date: [dd/mm/yyyy]");
				String date = sc.nextLine();
				System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
				var responseData = Integer.parseInt(sc.nextLine());
				if (responseData == 2) continue;

				int responseTime = 0;
				String time = "";
				do {
					System.out.println("Insert available time for date: " + date + " [16:00]");
					time = sc.nextLine();
					System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
					responseTime = Integer.parseInt(sc.nextLine());
				} while (responseTime == 2);

				UIMenu.doctorLogged.addAvailableAppointment(date, time);
				checkDoctorAvailableAppointments(UIMenu.doctorLogged);
			} else if (selectedMonth == 0) {
				showDoctorMenu();
			}
		} while(selectedMonth != 0);
	}

	private static void checkDoctorAvailableAppointments(Doctor doctor) {
		if (!doctor.getAvailableAppointments().isEmpty() && !doctorsAvailableAppointments.contains(doctor)) {
			doctorsAvailableAppointments.add(doctor);
		}
	}
}
