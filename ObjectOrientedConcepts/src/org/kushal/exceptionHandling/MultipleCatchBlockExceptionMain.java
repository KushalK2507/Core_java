package org.kushal.exceptionHandling;

public class MultipleCatchBlockExceptionMain {

	public static void main(String[] args) {
		int x;
		// In below case the catch block which is handling the Arithmetic Exception gets
		// executed

		// The sequence of catch is as it is implemted i.e. in below code first catch
		// block of
		// Arithemetic Exception catch will execute then the catch block of Exception is
		// executed
		try {
			System.out.println("Satetment will execute");
			x = 20 / 0;
			System.out.println("Satetment will not execute");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("In Arthmetic Excetion");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside Exception");
		}

	}

}
