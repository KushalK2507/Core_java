package methods;

public class Methods {

	public static void main(String args[]) {
		// Basic method
		System.out.println("Method");
		loop(5);

		System.out.println("Return By Value");
		// Return By Value
		System.out.println(area(4, 5));

		System.out.println("Method Overloading");
		// Method Overloading --> In below we have 2 methods with same name but the
		// number
		// of parameters in method. This is method overloading

		// The no of parameter are different.
		System.out.println("Area of Rectangle = " + area(4, 5));
		System.out.println("Area of Square = " + area(4));

		// The type of the parameter are different.
		System.out.println("Area of square : " + area(2.5));
		System.out.println("Area of square : " + area(5));

		// If change the return type and number of parameter remain same then it will
		// give compile time error
	}

	private static double area(double d) {
		return Math.pow(d, 2);
	}

	private static double area(int i) {
		return (Math.pow(i, 2));
	}

	private static double area(int i, int j) {
		return i * j;
	}

	private static void loop(int i) {
		for (int j = 1; j < i; j++) {
			System.out.println(j);
		}
	}
}
