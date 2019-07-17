package org.kushal.enumImplementation;

import java.util.Arrays;
import java.util.Scanner;

public class EnumMain {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course you want to learn");
		// IN case of Enum the Enum.value will return the array of all the values
		// present in that Enum class
		Enum[] values = Enum.values();
		System.out.println("Choose any one from the follwing");
		System.out.println(Arrays.asList(values));
		
		String userInout = sc.next();
		Enum courses = null;
		// Converting String value to Enum
		try {
			courses = Enum.valueOf(userInout.toUpperCase());
		} catch (RuntimeException e) {
			System.out.println("You have enterend incorrect value");
		} finally {
			sc.close();
		}
		if (null != courses) {
			switch (courses) {
			case COLLECTIONS:
				System.out.println("You are learning Collections");
				break;
			case COREJAVA:
				System.out.println("You are learning Core JAVA");
				break;
			case GENERICS:
				System.out.println("You are learning Generics");
				break;
			case JASPANDSERVLET:
				System.out.println("You are learning JSP and Servlet");
				break;
			case MULTITHREADING:
				System.out.println("You are learning Multi-Threading");
				break;
			default:
				System.out.println("Course you choosed is not available in our catalog");
				break;

			}
		}
		System.out.println("*******************");
		System.out.println();
		for (Enum course : Enum.values()) {
			System.out.println(course);
		}
		System.out.println("***************");
		// If we want to assign the value to enum then we have to use the constructor as
		// shown in the Enum class
		// To access the values assigned to enum we need to use the
		// EnumVariable.ordinal() as shown below
		for (Enum course : Enum.values()) {
			System.out.println("Value of " + course + " is " + course.ordinal());
		}
	}
}
