package org.kushal.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsAndThrowExceptionMain {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void someMethod() throws FileNotFoundException {
		FileReader in = new FileReader("file.txt");

		System.out.println("Some Message Executed");
		int x = 0;
		// Below shows the use of throw keyword, throw is a keyword which is used to
		// throw the exception explicitally
		if (x == 0) {
			throw new RuntimeException();
		}
	}

}
