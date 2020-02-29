package org.kushal.lambda;

// Lambda Expression is way by which we can pass the defination of the specific method
interface Lambda {
	public void demo();
}

interface LambdaArgument {
	public void demo(int a, int b);
}


public class LambdaMain {

	public static void main(String args[]) {

		// Below is the way to use the lambda expression.
		// Below this if we want single statement.
		Lambda lambda = () -> System.out.println("Statement 1");
		lambda.demo();

		System.out.println("**************");
		// We can multiple statement then we need to {} braces like below.
		Lambda lambda1 = () -> {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda1.demo();
		
		// Below Lambda Expression for the method which has arguments.
		// It is not needed to declare the type of arguments
		LambdaArgument argument = ( a, b) -> System.out.println(a+b);
		argument.demo(4, 5);

		// We can use lambda expression only for FUNCTIONAL TYPE INTERFACES only.
		// FUNCTIONAL TYPE INTERFACES is the interface there is EXACTLY 1 ABSTRACT
		// METHOD.
		// Example of Functional Interface is RUNNABLE interface, COMPARATOR Interface as it has only 1
		// abstract method i.e. run().
		Thread thread1 = new Thread(() -> {
			System.out.println("Thread 1");
		});
		thread1.start();
	}
}
