package org.kushal.staticelement;

public class StaticMain {

	public static void main(String[] args) {
		// Static variables has single copy in memory location.
		// If we create the new objects of the class containg the static variables then
		// also the variable static varaible will have only 1 memory location of all the
		// different object OR static variables is shared between different objects of
		// same class

		System.out.println("Curretn value of static vairalbe " + TestStaticVariable.getTestVarialbe());
		TestStaticVariable.setTestVarialbe(5);
		System.out.println("Curretn Value of static variable " + TestStaticVariable.getTestVarialbe());

		System.out.println("Current Value of static variable " + TestStaticVariable.getTestVarialbe());

		// Testing Inner Static class
		// True static class is class where all the methods and variables inside
		// the class are static
		// Any variable and methods inside the static class should be static
		System.out.println("******************************");
		StaticInnerClass.Inner.testingInnerMethod();
		System.out.println("Value of X " + StaticInnerClass.Inner.x);

		// Variable used inside the static class should be static even if they are
		// declared outisde the static class

		// The non static variables of other non static class can be accessed inside
		// static class by creating the object of the non static class but it is not
		// good practise
		System.out.println("******************************");
		StaticInnerClass.Inner.testingInnerMethod();

		// Accessing the values of Inner static class from outer non static class
		System.out.println("******************************");
		StaticInnerClass.accessInnerclas();
	}

}
