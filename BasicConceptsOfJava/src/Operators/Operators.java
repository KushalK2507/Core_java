package Operators;

public class Operators {

	public static void main(String args[]) {

		// Operator
		int x = 1;// assignment would be from right to left.
		System.out.println(x);

		int y = 1 + 2;// To add to entities arithmetic operation
		String s = "Hello" + "World"; // in this + is doing concanitating here
		System.out.println(y);
		System.out.println(s);

		// modulus operator --> gives the value of the remainder after the division.
		int mod = 13 % 2;// the remainder is 1 which is value of mod
		System.out.println(mod);

		// Increment Operator
		int z = 10;
		System.out.println(z++);// This is post increment i.e. print value first then increase output will be 10
		System.out.println(++z);// This is pre increment i.e. increase the value first the print it out put will
								// be 12

		// decision making with al operators
		int x3 = 5, y3 = 6;
		if (x3 == 5) {
			System.out.println("Value of x = " + x3);
		} else if (x3 != 5) {
			System.out.println("Value of x is not " + x3);
		} else if (x3 < y3) {
			System.out.println("Value = true x3<y3");
		} else if (x3 > y3) {
			System.out.println("Value =  true x3>y3");
		}

		boolean x4 = true;
		boolean y4 = false;
		// && Operator is true only if both the operand are true
		if (x4 && y4) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		// || operator is true if any operand is true.
		if (x4 || y4) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		if ((x < y) && (x4 == y4)) {
			System.out.println("Value is true");
		} else {
			System.out.println("Value is false");
		}

		if (!((x < y) && (x4 == y4))) {
			System.out.println("Value is false");
		} else {
			System.out.println("Value is true");
		}

		// Ternary Operator
		boolean bool;
		bool = (5 > 4) ? true : false;
		System.out.println(bool);

		int ter;
		ter = (10 == 9) ? 1 : 0;
		System.out.println(ter);

		int ter1 = 10;
		ter1 = (10 == ter1) ? 1 : 0;
		System.out.println(ter1);

		// Assignment Operator
		int assign = 5;
		assign += 5;// x=x+5
		System.out.println(assign);
		assign -= 5;// x=x-5;
		System.out.println(assign);
		int mul = 5;
		mul *= 5;// mul=mul*5
		System.out.println(mul);
		int div = 5;
		div /= 5;// div=div/5;
		System.out.println(div);

		int modulo = 5;
		modulo %= 5;// modulo=modulo%5;
		System.out.println(modulo);
		
		int condition=10;
		if(condition==5);
			System.out.println("true");

	}
}
