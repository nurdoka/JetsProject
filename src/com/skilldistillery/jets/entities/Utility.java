package com.skilldistillery.jets.entities;

public class Utility extends Helicopters {
	public Utility(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		System.out.println("I am an utility helicopter " + this.toString() + " and I can fly: "
				+ super.getRange() / super.getSpeed() + " hours");
	}

}
