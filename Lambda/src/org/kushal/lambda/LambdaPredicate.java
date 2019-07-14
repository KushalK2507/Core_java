package org.kushal.lambda;

import java.util.function.IntPredicate;

// Predicates are something which are used to perform some boolean operation and 
//based on the operation we will receive the boolean value.
// Perdicate is functional interface.
public class LambdaPredicate {

	public static void main(String[] args) {

		IntPredicate lessThan18 = new IntPredicate() {

			@Override
			public boolean test(int arg0) {
				return false;
			}
		};
		System.out.println(lessThan18.test(10));

		// In INTPREDICATE we need to override the method called test().
		// As above we can implement the above using Lambda.
		IntPredicate lessThan18Lambda = i -> {
			if (i < 18)
				return false;
			else {
				return true;
			}
		};
		System.out.println(lessThan18Lambda.test(19));

		IntPredicate morethan20 = j -> {
			if (j > 20) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(lessThan18.and(morethan20).test(20));
		// Similiarly like above we also have or also.

		new LambdaPredicate().demo(10, lessThan18Lambda, morethan20);

	}

	public void demo(int x, IntPredicate lessThan18, IntPredicate morethan20) {
		if (lessThan18.and(morethan20).test(20)) {
			System.out.println("Input is less than 18 and more than 20");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
