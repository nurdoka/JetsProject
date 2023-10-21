package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AirField {

	private List<Helicopters> fleet;

	public AirField() {
		fleet = new ArrayList<>();
		readHelicoptersFromFile();
	}

	public void readHelicoptersFromFile() {
		String fileName = "helicopters.txt";
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;

			while ((line = bufIn.readLine()) != null) {

				String[] helicopterDetails = line.split(", ");

				String type = helicopterDetails[0];
				String model = helicopterDetails[1];
				double speed = Double.parseDouble(helicopterDetails[2]);
				int range = Integer.parseInt(helicopterDetails[3]);
				long price = Long.parseLong(helicopterDetails[4]);

				addHelicopter(type, model, speed, range, price);

			}
		} catch (IOException e) {
			System.err.println(e);

		}

	}
	
	public void removeHelicopter(int choice) {
		fleet.remove(choice);
	}
	
	public void dogFight() {
		for (Helicopters helicopters : fleet) {
			if (helicopters instanceof Attack) {
				System.out.print(helicopters + "--> ");
				((Attack) helicopters).fight();
			}
		}
	}

	public void loadAllCargoHelicopters() {
		for (Helicopters helicopters : fleet) {
			if (helicopters instanceof Cargo) {
				System.out.print(helicopters + "--> ");
				((Cargo) helicopters).loadCargo();
			}
		}
	}

	public Helicopters longestRangeHelicopter() {
		Helicopters helicopter = fleet.get(0);
		int helicopterLongestRange = fleet.get(0).getRange();
		for (Helicopters helicopters : fleet) {
			int tempHelRange = helicopters.getRange();
			if (helicopterLongestRange < tempHelRange) {
				helicopterLongestRange = tempHelRange;
				helicopter = helicopters;
			}
		}
		return helicopter;
	}

	public Helicopters fastestHelicopter() {
		Helicopters helicopter = fleet.get(0);
		double helicopterSpeed = fleet.get(0).getSpeed();
		for (Helicopters helicopters : fleet) {
			double tempHelSpeed = helicopters.getSpeed();
			if (helicopterSpeed < tempHelSpeed) {
				helicopterSpeed = tempHelSpeed;
				helicopter = helicopters;
			}
		}
		return helicopter;
	}

	public void flyAllHelicopters() {
		for (Helicopters helicopters : fleet) {
			helicopters.fly();
		}
	}

	public void addHelicopter(String type, String model, double speed, int range, long price) {
		switch (type) {
		case "Cargo":
			fleet.add(new Cargo(model, speed, range, price));
			break;
		case "Attack":
			fleet.add(new Attack(model, speed, range, price));
			break;
		case "Utility":
			fleet.add(new Utility(model, speed, range, price));
			break;
		default:
			System.out.println("Invalid helicopter info, try again!");
		}

	}

	public void displayAllFleet() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(i+1 + " " + fleet.get(i));
		}
	}
}
