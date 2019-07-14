package org.kushal.exceptionHandling;

public class BasicExceptionMain {

	public static void main(String[] args) {
		BasicExceptionMain main = new BasicExceptionMain();

		main.case1(10, 0);
		// So while executing case2 we are getting exception as ArithmeticException if
		// will not implement try block.
		// But after implementating try catch code is working without Exception
		main.case2(10, 0);
		System.out.println("******************************");

	}

	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x / y);

		} else {
			System.out.println("Value of Y is 0");
		}
	}

	public void case2(int x, int y) {
		try {
			System.out.println(x / y);
		} catch (Exception e) {

			System.out.println("Value of Y is 0 Exception Catched");
		}
	}

}
