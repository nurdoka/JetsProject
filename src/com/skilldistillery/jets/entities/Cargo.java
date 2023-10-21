package com.skilldistillery.jets.entities;

public class Cargo extends Helicopters implements CargoCarrier{
	
	public Cargo(String model, double speed, int range, long price) {
		super(model,speed,range,price);
	}
	
	public void fly() {
		System.out.println("I am a cargo helicopter "+ this.toString()+ " and I can fly: " + super.getRange()/super.getSpeed() + " hours");
	}

	@Override
	public void loadCargo() {
		System.out.println("I carry cargo!");
		
	}

}
