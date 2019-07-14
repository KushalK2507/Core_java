package org.kushal.exceptionHandling;

import java.io.FileNotFoundException;

public class UserDefinedExceptionMain {

	public static void main(String[] args) {
		try {
			try {
				someMethod();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("Catch of FileNotFound Exception");
			} catch (UserDefinedException e) {
				System.out.println("User defined Exception");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Catch Of Exception");
			}

		} catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Runtime Exception");
		}
	}

	// In below we have have throws UserDefinedExcetpion as it extends Throwable
	// class which is parent class of Exception, If we have extended UserDefined
	// Exception with Exception class then we don't have throws UserDefinedException
	// in this class separately.
	public static void someMethod() throws Exception, FileNotFoundException, UserDefinedException {
		int x = 3;

		switch (x) {
		case 1:
			throw new FileNotFoundException();

		case 2:
			throw new Exception();
		default:
			throw new UserDefinedException();

		}

	}

}

class UserDefinedException extends Throwable {

}
