package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class HelicoptersApp {

	public static void main(String[] args) {
		HelicoptersApp app = new HelicoptersApp();
		app.run();

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		AirField field = new AirField();
		String choice = "";
		while (!choice.equals("9")) {
			displayMenu();
			choice = sc.next();
			menuAction(choice, field);
		}
		sc.close();
	}

	public void menuAction(String choice, AirField field) {
		switch (choice) {
		case "1":
			field.displayAllFleet();
			break;
		case "2":
			field.flyAllHelicopters();
			break;
		case "3":
			System.out.println("Fastest helicopter is: " + field.fastestHelicopter());
			break;
		case "4":
			System.out.println("Longest range helicopter is: " + field.longestRangeHelicopter());
			break;
		case "5":
			field.loadAllCargoHelicopters();
			break;
		case "6":
			field.dogFight();
			break;
		case "7":
			helicopterDetailInput(field);
			break;
		case "8":
			field.displayAllFleet();
			removingHelicDetail(field);
			break;
		case "9":
			System.out.println("Bye Bye!");
			break;
		default:
			System.out.println("Invalid entry, try again!");
		}
	}
	public void removingHelicDetail(AirField field) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which helicopter to remove: ");
		int helNumber = sc.nextInt();
		field.removeHelicopter(helNumber-1);
	}

	public void helicopterDetailInput(AirField field) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter helicopter type (Cargo, Attack, Utility): ");
		String type = sc.next();

		System.out.print("Enter helicopter model: ");
		String model = sc.next();

		System.out.print("Enter helicopter speed: ");
		double speed = sc.nextDouble();

		System.out.print("Enter helicopter range: ");
		int range = sc.nextInt();

		System.out.print("Enter helicpoter price: ");
		long price = sc.nextLong();

		field.addHelicopter(type, model, speed, range, price);

	}

	public void displayMenu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all helicopters");
		System.out.println("3. View fastest helicopter");
		System.out.println("4. View helicopter with longest range");
		System.out.println("5. Load all Cargo helicopters");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a helicopter to Fleet");
		System.out.println("8. Remove a helicopter from Fleet");
		System.out.println("9. Quit");
		System.out.print("Choose your number: ");
	}

}
