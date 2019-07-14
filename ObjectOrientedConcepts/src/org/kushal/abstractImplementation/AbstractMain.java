package org.kushal.abstractImplementation;

public class AbstractMain {

	public static void main(String[] args) {
		Person john = new Vegan();
		john.eat();

		System.out.println("*****************");
		Person mia = new NonVegan();
		mia.eat();
	}

}
