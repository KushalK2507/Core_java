package org.kushal.inheritance;

public class CarChild extends VehicleParent {
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;

	public CarChild() {
		super();
		this.steering = "adjustable";
		this.airConditioner = "GoodCooling";
		this.musicSystem = "JBL";
		this.fridge = "small";
	}

	public CarChild(String steering, String musicSystem, String airConditioner, String fridge,
			String entertainmentSystem, String engine, int wheels, int seats, int feulTank, String lights) {
		super(engine, wheels, seats, feulTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}

	private String entertainmentSystem;

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

	public String getFridge() {
		return fridge;
	}

	public void setFridge(String fridge) {
		this.fridge = fridge;
	}

	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public void setEntertainmentSystem(String entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	
	@Override
	public void run()
	{
		System.out.println("Car is Running");
	}

}
