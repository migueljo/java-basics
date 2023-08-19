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
}
