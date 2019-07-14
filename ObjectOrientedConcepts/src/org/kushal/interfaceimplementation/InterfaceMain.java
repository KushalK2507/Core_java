package org.kushal.interfaceimplementation;

public class InterfaceMain {

	public static void main(String args[]) {

		OnePlus5 phone = new OnePlus5();
		String processor = phone.processor();
		System.out.println("One Plus Processor " + processor);

		// In interface we only have a declaration and no implementation
		Phone OnePlus5 = new OnePlus5();
		System.out.println(OnePlus5.processor());

	}
}
