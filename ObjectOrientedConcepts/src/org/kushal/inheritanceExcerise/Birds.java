package org.kushal.inheritanceExcerise;

public class Birds extends Animal {

	private boolean canFly;

	public Birds() {
		super();
		this.canFly = true;
	}

	public Birds(double height, double weight, String animalType, String bloodType, boolean canFly) {
		super(height, weight, animalType, bloodType);
		this.canFly = canFly;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String withFeatures() {
		return "Animals With Feature";
	}

	@Override
	public String toString() {
		return "Birds [isCanFly()=" + isCanFly() + ", withFeatures()=" + withFeatures() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}

	
	

}
