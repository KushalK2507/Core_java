package org.kushal.inheritanceExcerise;

public class Reptile extends Animal {

	private String skin;
	private boolean backBone;

	public Reptile() {
		super();
		this.skin = "Dry Skin";
		this.backBone = false;
	}

	public Reptile(double height, double weight, String animalType, String bloodType, String skin, boolean backBone) {
		super(height, weight, animalType, bloodType);
		this.skin = skin;
		this.backBone = backBone;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public boolean isBackBone() {
		return backBone;
	}

	public void setBackBone(boolean backBone) {
		this.backBone = backBone;
	}

	public String eggType() {
		return "Soft Shelled";
	}

	@Override
	public String toString() {
		return "Reptile [getSkin()=" + getSkin() + ", isBackBone()=" + isBackBone() + ", eggType()=" + eggType()
				+ ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

}
