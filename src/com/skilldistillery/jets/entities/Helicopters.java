package com.skilldistillery.jets.entities;

public abstract class Helicopters {
	private String model;
	private double speed;
	private int range;
	private long price;
	private String pilot;
	
	public Helicopters(String model, double speed, int range, long price){
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public abstract void fly();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Helicopters [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + ", pilot="
				+ pilot + "]";
	}
	
	
}
