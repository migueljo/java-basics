package oop;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
	private String speciality;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	Doctor(String name, String email, String speciality) {
		super(name, email);
		System.out.println("Building doctor object");
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public void addAvailableAppointment(Date date, String time) {
		AvailableAppointment appointment = new AvailableAppointment(date, time);
		this.availableAppointments.add(appointment);
	}

	public ArrayList<AvailableAppointment> getAvailableAppointments() {
		return this.availableAppointments;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Speciality: " + speciality + "\n" + availableAppointments.toString();
	}

	public static class AvailableAppointment {
		private int id;
		private Date date;
		private String time;

		public AvailableAppointment(Date date, String time) {
			this.date = date;
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Available appointment: Date: " + this.date + ", Time: " + this.time + "\n";
		}
	}
}
