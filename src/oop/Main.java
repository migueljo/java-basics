package oop;
import oop.model.Doctor;
import oop.model.Patient;
import oop.ui.UIMenu;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Miguel Martínez", "mmartinez@gmail.com", "Neurólogo");
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "5pm");
		myDoctor.addAvailableAppointment(new Date(), "6pm");

		for (Doctor.AvailableAppointment appointment: myDoctor.getAvailableAppointments()) {
			System.out.println(appointment.getDate() + " :: " + appointment.getTime());
		}

		Patient patient = new Patient("Ale", "ale@gmail.com");
		System.out.println(patient);
		System.out.println(myDoctor);

		patient.setWeight(85);
		System.out.println(patient.getWeight());;
		UIMenu.showMenu();
	}
}
