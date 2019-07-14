package looping;

public class Loop2 {

	public static void main(String args[]) {
		// Break
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			if (i == 2) {
				break;
			}
		}
		// Continue
		for (int i = 1; i < 5; i++) {

			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}

		// Nested Loop
		for (int y = 1; y < 4; y++) {
			for (int z = 1; z < 4; z++) {
				System.out.println("y =" + y + " z = " + z);
			}
			System.out.println("*********");
		}

		// Exercise
		for (int k = 1; k <= 5; k++) {
			for (int l = 1; l <= k; l++) {
				System.out.print("@");
			}
			System.out.println();
		}

		// Modulo Operator
		int quotient = 10 / 3;
		int rem = 10 % 3;
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + rem);

		// Even Or Odd
		for (int o = 1; o <= 5; o++) {
			if (o % 2 == 0) {
				System.out.println("Even " + o);
			} else {
				System.out.println("Odd " + o);
			}
		}
		
		// Sum of Digits
		int value=1234;
		int sumOfDigits=0;
		//1+2+3+4
		while (value > 0)
		{
			sumOfDigits=sumOfDigits+(value%10);
			value=value/10;
		}
		System.out.println("SUM = "+sumOfDigits);
	}

}
