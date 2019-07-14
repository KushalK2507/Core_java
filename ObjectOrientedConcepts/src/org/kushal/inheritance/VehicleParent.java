package org.kushal.inheritance;

public class VehicleParent {

	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	public VehicleParent() {
		this.engine = "Petrol";
		this.wheels = 4;
		this.seats = 4;
		this.lights = "LED";
		this.fuelTank = 35;
	}

	public VehicleParent(String engine, int wheels, int seats, int feulTank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = feulTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFeulTank() {
		return fuelTank;
	}

	public void setFeulTank(int feulTank) {
		this.fuelTank = feulTank;
	}

	public String getLights() {
		return lights;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	public void run() {
		System.out.println("Running Vehicle");
	}

}
