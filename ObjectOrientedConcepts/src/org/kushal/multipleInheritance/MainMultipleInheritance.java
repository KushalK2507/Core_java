package org.kushal.multipleInheritance;

public class MainMultipleInheritance {

	public static void main(String args[]) {
		Person kushal = new Vegan();
		kushal.breathe();
		kushal.eat();
		kushal.message();
		kushal.speak();
	}
}
