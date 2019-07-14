package org.kushal.inheritanceExcerise;

public class Eel extends Fish {

	private String charge;

	public Eel() {
		super();
		
		this.charge = "Release Electriv Charge";
	}

	public Eel(double height, double weight, String animalType, String bloodType, String livesIn, boolean hasGill,
			String charge) {
		super(height, weight, animalType, bloodType, livesIn, hasGill);
		this.charge = charge;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String showInfo() {
		return toString();
	}

	@Override
	public String toString() {
		return "Eel [getCharge()=" + getCharge() + ", getLivesIn()=" + getLivesIn() + ", isHasGill()=" + isHasGill()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

}
