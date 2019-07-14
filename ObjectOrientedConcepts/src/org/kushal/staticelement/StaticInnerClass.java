package org.kushal.staticelement;

public class StaticInnerClass {
	private static int testVar = 5;

	private static void testOuterClass() {
		System.out.println("Testing Outer class");

	}

	public static void accessInnerclas() {
		System.out.println("Testing access Inner Class");
		System.out.println("Value of X = " + Inner.x);
		Inner.testingInnerMethod();

	}

	public static class Inner {
		public static int x = 0;

		public static void testingInnerMethod() {

			System.out.println("Testing Inner Class");
			System.out.println("Test Value of testVar " + testVar);
			testOuterClass();

		}

	}
}
