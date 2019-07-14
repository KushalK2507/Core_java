package org.kushal.inheritance;

public class BikeChild extends VehicleParent {
	private String handle;

	public BikeChild() {
		super();
		this.handle = "Short";
	}

	public BikeChild(String handle) {
		super();
		this.handle = handle;
	}

	public BikeChild(String handle, String engine, int wheels, int seats, int feulTank, String lights) {
		super(engine, wheels, seats, feulTank, lights);
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "BikeChild [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFeulTank()=" + getFeulTank() + ", getLights()=" + getLights()
				+ "]";
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
}
