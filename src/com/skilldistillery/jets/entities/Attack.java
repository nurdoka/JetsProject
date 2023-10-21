package com.skilldistillery.jets.entities;

public class Attack extends Helicopters implements CombatReady {
	public Attack(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		System.out.println("I am an attack helicopter " + this.toString() + " and I can fly: "
				+ super.getRange() / super.getSpeed() + " hours");
	}

	@Override
	public void fight() {
		System.out.println("I protect my fellow helicopters!");
	}
}
