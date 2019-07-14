package org.kushal.lambda;

interface LambdaVoid {
	abstract void demo();
}

public class LambdaWithInterfaceVoid {

	public static void main(String[] args) {

		LambdaVoid lambda = new LambdaVoid() {

			@Override
			public void demo() {
				System.out.println("Inside Demo");
			}
		};
		lambda.demo();

		// Above can be implemented using Lambda Expression.
		// -> this is known as arrow token
		LambdaVoid lambdaExpression = () -> System.out.println("Inside demo Using Lambda");
		lambdaExpression.demo();
	}

}
