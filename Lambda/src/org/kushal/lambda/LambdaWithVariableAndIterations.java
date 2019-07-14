package org.kushal.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithVariableAndIterations {

	public static void main(String[] args) {
		int x = 10;
		// x++;
		// If we try to execute the code with x++ we would get the below exception.
		// Local variable x defined in an enclosing scope must be final or effectively
		// final
		// Java does not allow the change of value if the variable is used inside the
		// thread or Anonymous class since these are 2 different threads which can run
		// simulataneously and can give the unexpected output.
		// Hence it stated use of final varialbe which cannot be modified OR effectively
		// final variable are those whose value is not modified. in above x is
		// effectively final variable.

		new Thread(() -> System.out.println("The value of x " + x)).start();

		// Enhanced For loop
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for (Integer i : list) {
			if (i >= 2) {
				System.out.println(i);
			}
		}

		// for each loop
		// Below we would require the temporary variable which is "i" we don't require
		// to define the type of the variable for-each automatically does it for us.
		System.out.println("*******************");
		list.forEach(i -> System.out.println(i));

		System.out.println("***********");
		list.forEach(i -> {
			if (i >= 4) {
				System.out.println(i);
			}
		});

	}

}
