package oop;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
	static int id = 0; // auto-incremented
	private int instanceId;
	private String name;
	private String speciality;
	private String email;
	private String address;
	private String phoneNumber;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	Doctor() {}

	Doctor(String name, String speciality) {
		System.out.println("Building doctor object");
		this.name = name;
		this.speciality = speciality;
		this.instanceId = Doctor.id;
		Doctor.id++;
	}

	public void showName() {
		System.out.println("Doctor's name is: " + name);
	}

	public void showId() {
		System.out.println("The id is: " + this.instanceId);
	}

	public void addAvailableAppointment(Date date, String time) {
		AvailableAppointment appointment = new AvailableAppointment(date, time);
		this.availableAppointments.add(appointment);
	}

	public ArrayList<AvailableAppointment> getAvailableAppointments() {
		return this.availableAppointments;
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
	}
}
