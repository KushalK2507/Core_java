package org.kushal.encapsulation;

public class EncapsulationMain {

	public static void main(String args[]) {

		Person kushal = new Person();
		System.out.println(kushal);
		// kushal.age=-10; // Now this is giving error since previously age field is
		// public but now we changes it to private

		// Encapsulation gives the shell to the data i.e. to hide it from outside world.
		// Firstly, Encapsulation provides hide the data from outside word, i.e. making
		// the properties as private and genearting the setter of those fields for which
		// we can give the access to outside world.
	}
}
