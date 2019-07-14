package org.kushal.finalKeyword;

public class FinalMain {

	public static void main(String args[]) {

		// If there is final property in a class then there would be no setter method
		// for setting its value
		B obj1 = new B();
		System.out.println("Value of X " + obj1.getX());

		// If we want override the India in B class it will give us compile time
		// exception, since final entities cannot be overriden
		obj1.usa();
		obj1.india();

		// Final class cannot be parent class i.e if we declare any class as final then
		// we canot use it as parent class OR extend it in sub class.

	}

}
