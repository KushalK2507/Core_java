package org.kushal.lambda;

interface LambdaReturn {
	abstract int demo();
}

public class LambdaWithInterfaceReturn {

	public static void main(String[] args) {
		LambdaReturn lambda = new LambdaReturn() {

			@Override
			public int demo() {
				System.out.println("We are returning a value");
				return 10;
			}
		};
		System.out.println(lambda.demo());

		// The above code can be implemented into Lambda expression easily as below
		// If we have single return statement then it is not necessary to use return
		// statement, we need to use return we there are multiple statement.
		LambdaReturn lambdaExpression = () -> 10;
		System.out.println("Single return " + lambdaExpression.demo());

		// We can also have multiple statement as below
		LambdaReturn lambdaExpressionMultiple = () -> {
			System.out.println("We are returnig a value");
			return 10;
		};
		System.out.println(lambdaExpressionMultiple.demo());

		LambdaReturn lambdaOperation = () -> (10 * 25 / 5);
		System.out.println("Value of operation = " + lambdaOperation.demo());
	}

}
