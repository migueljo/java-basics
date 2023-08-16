package oop;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Miguel Martínez", "Neurólogo");
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "5pm");
		myDoctor.addAvailableAppointment(new Date(), "6pm");

		for (Doctor.AvailableAppointment appointment: myDoctor.getAvailableAppointments()) {
			System.out.println(appointment.getDate() + " :: " + appointment.getTime());
		}

		Patient patient = new Patient("Ale", "ale@gmail.com");
		patient.setWeight(85);
		System.out.println(patient.getWeight());;
		UIMenu.showMenu();
	}
}
