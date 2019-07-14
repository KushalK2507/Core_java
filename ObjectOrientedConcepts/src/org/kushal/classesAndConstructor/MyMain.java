package org.kushal.classesAndConstructor;

public class MyMain {

	public static void main(String[] args) {

		Car car = new Car();
		// If we directly execute the below statement it will give Null Pointer
		// Exception
		// System.out.println(car.run());

		// Setting the values
		car.setDoor("closed");
		car.setDriver("Seated");
		car.setEngine("ON");
		System.out.println(car.run());

		car.setSpeed(5);
		System.out.println(car.run());

		// Parameterised Constructor
		Car car2 = new Car("open", "on", "seated", 10);

		System.out.println(car2.run());

	}

}
