package org.kushal.array;

public class ArrayMain {

	public static void main(String[] args) {

		// Array is ordered sequence OR arrangement of same datatype
		// Array is a collection of same datatype stored in adjacent memory location

		// Creating the array
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(x[4]);

		System.out.println("**************************");
		String[] names = { "abc", "def", "ghi", "jkl" };
		System.out.println(names[2]);

		System.out.println("***************************");

		// Accessing array using for-each
		for (String name : names) {
			System.out.print(" " + name);
		}
		System.out.println();
		System.out.println("**************************");

		// Accessing array with normal for loop
		for (int i = 0; i < names.length; i++) {
			System.out.print(" " + names[i]);
		}

		System.out.println();

		System.out.println("*********************************");
		// Below is the example for callBy Value
		int value = 10;
		// IN below the value will be 10 always in main method as during the call the
		// value passed in the method and value in method shares the different memory
		// location. Hence the value in the callByMethod scope is local to that method
		// and that memory location is released when method ends
		System.out.println("Value in main method " + value);
		ArrayMain array = new ArrayMain();
		array.callByValue(value);
		System.out.println("Value in main method " + value);

		System.out.println("**************************************");
		// Below is the example of call by Reference

		String newNames[] = { "AMDOCS", "NetCreacker", "MasterCard", "Accenture" };
		// In below we are passing the whole array to function, in array the values are
		// not but the reffernce of the first memory location send to new function so id we
		// update or change any values in any location the main value will be effected.
		// as in below example
		System.out.println("Value in main method");
		for (String name : newNames) {
			System.out.print(" " + name + " ");
		}
		System.out.println();
		array.callByReference(newNames);
		System.out.println();
		System.out.println();
		System.out.println("Value in main method after calling call be reference");
		for (String name : newNames) {
			System.out.print(" " + name + " ");
		}

	}

	void callByValue(int value) {
		System.out.println("Value in callByValue method " + value);
		value = 20;
		System.out.println("Value in callByValue method" + value);
	}

	void callByReference(String[] newNames) {
		System.out.println();
		System.out.println("Value in callByRefernce method");
		for (String name : newNames) {
			System.out.print(" " + name + " ");
		}
		newNames[0] = "BSN Infotech";
		System.out.println();
		System.out.println();
		System.out.println("Value in callByRefernce method");
		for (String name : newNames) {
			System.out.print(" " + name + " ");
		}

	}

}
