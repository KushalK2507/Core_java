package org.kushal.multipleInheritance;

public abstract class Person implements IsAlive, LiveLife {

	public void speak() {
		System.out.println("Shares his/her Thoughts");
	}

	public abstract void eat();

	@Override
	public void breathe() {
		System.out.println("be alive, remian living");
	}

	@Override
	public void message() {
		System.out.println("Life is journey");
	}
}
