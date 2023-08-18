package oop;
import oop.model.Doctor;
import oop.model.ISchedulable;
import oop.model.Patient;
import oop.model.User;
import oop.ui.UIMenu;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Miguel Martínez", "mmartinez@gmail.com", "Neurólogo");
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "5pm");
		myDoctor.addAvailableAppointment(new Date(), "6pm");

		User doctor = new Doctor("Andrés", "a@a.com", "oncología");
		doctor.showDataUser();
		User patient0 = new Patient("Mateo", "m@m.com");
		patient0.showDataUser();

		User user1 = new User("Carmen", "c@c.com") {
			@Override
			public void showDataUser() {
				System.out.println("Doctor");
				System.out.println("Hospital: Cruz Verde");
				System.out.println("Departamento: Pediatría");
			}
		};
		user1.showDataUser();

		ISchedulable iSchedulable = new ISchedulable() {
			@Override
			public void schedule(Date date, String time) {

			}
		};


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
