package org.kushal.inheritanceExcerise;

public class Animal {

	private double height;
	private double weight;
	private String animalType;
	private String bloodType;

	public Animal() {
		this.height = 0.0;
		this.weight = 0.0;
		this.animalType = "Animal";
		this.bloodType = "Normal";
	}

	public Animal(double height, double weight, String animalType, String bloodType) {
		super();
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "Animal [getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}

}
