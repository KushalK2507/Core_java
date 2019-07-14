package org.kushal.fileHandling.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

	/**
	 * 
	 */
	// Below is automactic generated version id if we create the file and give with
	// some version ID then change the version id below and then again just try to
	// read the data from the file it will give InvalidClassException
	private static final long serialVersionUID = -6224319311923756762L;
	private String type;
	private int number;

	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}

}
