package oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Doctor myDoctor = new Doctor("Miguel Martínez", "Neurólogo");
		Patient patient = new Patient("Ale", "ale@gmail.com");
		UIMenu.showMenu();
	}
}
