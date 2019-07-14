package org.kushal.composition;

public class MainComposition {

	public static void main(String args[]) {

		// Composition shares "has a" relationship. Like Laptop has a Screen.
		// The Processor Object which is present inside Laptop class describes
		// Composition.
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getBrand());

		Processor processor = new Processor("intel", "i5", "7", "4", "2", "4MB", "2.Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicCard = new GraphicsCard("Nvidia", "1050", "2GB");
		Laptop gammingLaptop = new Laptop("17", processor, "8GB", "2TB", graphicCard, null, "backlit");

		System.out.println(gammingLaptop);
	}
}
