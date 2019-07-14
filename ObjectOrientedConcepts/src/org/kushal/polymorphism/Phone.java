package org.kushal.polymorphism;

public class Phone {

	private String Model;

	public Phone(String model) {

		Model = model;
	}

	public void feature() {
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
}
