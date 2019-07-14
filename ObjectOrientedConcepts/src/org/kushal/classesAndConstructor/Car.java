package org.kushal.classesAndConstructor;

public class Car {

	// Properties
	private String door;
	private String engine;
	private String driver;
	private int speed;

	// Default Constructor
	public Car() {
		door = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}

	// Parameterized Constructor
	public Car(String door, String engine, String driver, int speed) {

		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String run() {
		if (door.equals("closed") && engine.equals("ON") && driver.equals("Seated") && speed > 0) {
			return "Running";
		} else {
			return "Not Running";
		}
	}

}
