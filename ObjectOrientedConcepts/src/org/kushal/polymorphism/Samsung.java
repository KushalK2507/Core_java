package org.kushal.polymorphism;

public class Samsung extends Phone {

	public Samsung(String model) {
		super(model);
	}

	public void feature() {
		System.out.println("Android Flagship");
	}
}
