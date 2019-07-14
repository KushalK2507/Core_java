package org.kushal.inheritanceExcerise;

public class Eagle extends Birds {

	public Eagle(double height, double weight, String animalType, String bloodType, boolean canFly) {
		super(height, weight, animalType, bloodType, canFly);
	}

	public Eagle() {
		super();
	}

	public String showInfo() {
		return toString();
	}

	@Override
	public String toString() {
		return "Eagle [isCanFly()=" + isCanFly() + ", withFeatures()=" + withFeatures() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

}
