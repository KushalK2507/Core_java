package org.kushal.inheritanceExcerise;

public class Fish extends Animal {

	private String livesIn;
	private boolean hasGill;

	public Fish() {
		super();
		this.livesIn = "Water";
		this.hasGill = true;
	}

	public Fish(double height, double weight, String animalType, String bloodType, String livesIn, boolean hasGill) {
		super(height, weight, animalType, bloodType);
		this.livesIn = livesIn;
		this.hasGill = hasGill;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public void setLivesIn(String livesIn) {
		this.livesIn = livesIn;
	}

	public boolean isHasGill() {
		return hasGill;
	}

	public void setHasGill(boolean hasGill) {
		this.hasGill = hasGill;
	}

	@Override
	public String toString() {
		return "Fish [getLivesIn()=" + getLivesIn() + ", isHasGill()=" + isHasGill() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

}
