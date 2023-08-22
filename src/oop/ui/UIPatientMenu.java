package oop.ui;

import oop.model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
	public static void showPatientMenu() {
		var response = 0;
		do {
			System.out.println("Patient menu");
			System.out.println("Welcome: " + UIMenu.patientLogged.getName());
			System.out.println("1. Book an appointment");
			System.out.println("2. My appointments");
			System.out.println("0. Logout");

			Scanner sc = new Scanner(System.in);
			response = Integer.parseInt(sc.nextLine());

			switch (response) {
				case 1 -> showBookAppointmentMenu();
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

			Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
			var k = 0;
			for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
				ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu
								.doctorsAvailableAppointments
								.get(i)
								.getAvailableAppointments();
				
				Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
				for (int j = 0; j < availableAppointments.size(); j++) {
					k++;
					System.out.println(k + ". " + availableAppointments.get(j).getDate());
					doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
					doctors.put(k, doctorAppointments);
				}
			}

			Scanner sc = new Scanner(System.in);
			int responseDateSelected = Integer.parseInt(sc.nextLine());

			Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
			var indexDate = 0;
			Doctor doctorSelected = new Doctor("", "", "");
			for (Map.Entry<Integer, Doctor> doc: doctorAvailableSelected.entrySet()) {
				indexDate = doc.getKey();
				doctorSelected = doc.getValue();
			}

			System.out.println(
							doctorSelected.getName() +
											". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
											". Time: " + doctorSelected
											.getAvailableAppointments()
											.get(indexDate)
											.getTime());

			System.out.println("Confirm your appointment: \n1. Yes \n2. Change data");
			response = Integer.parseInt(sc.nextLine());
			if (response == 1) {
				UIMenu.patientLogged.addAppointmentDoctors(
								doctorSelected,
								doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
								doctorSelected.getAvailableAppointments().get(indexDate).getTime());
				showPatientMenu();
			}
		} while (response != 0);
	}

	private static void showPatientMyAppointments() {
		var response = 0;
		do {
			System.out.println(":: My Appointments");
			if (UIMenu.patientLogged.getAppointmentDoctors().isEmpty()) {
				System.out.println("Don't have appointments");
				break;
			}
			for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
				int j = i + 1;
				System.out.println(j + ". " +
								"Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
								"Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
								"\nDoctor:: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
			}
		} while (response != 0);
	}
}
