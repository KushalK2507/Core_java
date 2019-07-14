package org.kushal.inheritance;

public class TruckChild extends VehicleParent {

	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String containers;

	public TruckChild() {
		super();
		this.steering = "NonAdjustable";
		this.musicSystem = "Chinese";
		this.airConditioner = "NotGood";
		this.containers = "WaterContainer";
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}

	public String getAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}

	public String getContainers() {
		return containers;
	}

	public void setContainers(String containers) {
		this.containers = containers;
	}
	
	@Override
	public void run()
	{
		System.out.println("Truck is Running");
	}
}
