package org.kushal.inheritanceExcerise;

public class Crocodile extends Reptile {

	public Crocodile(double height, double weight, String animalType, String bloodType, String skin, boolean backBone) {
		super(height, weight, animalType, bloodType, skin, backBone);
	}

	public Crocodile() {
		super();
	}

	@Override
	public String eggType() {
		return "Hard Shelled";
	}

	public String showInfo() {
		return toString();
	}

	@Override
	public String toString() {
		return "Crocodile [eggType()=" + eggType() + ", getSkin()=" + getSkin() + ", isBackBone()=" + isBackBone()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

}
