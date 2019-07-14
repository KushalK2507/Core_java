package looping;

public class Loop {

	public static void main(String args[]) {

		// Using for loop
		for (int x = 1; x < 5; x++) {
			System.out.println(x);
		}

		int y = 5;
		System.out.println("Value of Y");
		for (; y > 1; y--) {
			System.out.print(y);
		}
		System.out.println();

		int z = 0;
		System.out.println("Value of z");
		for (;; z++) {
			System.out.print(z);
			if (z >= 4) {
				break;
			}
		}
		System.out.println();

		int a = 0;
		System.out.println("Value of a");
		for (;;) {
			System.out.print(a);
			if (a > 4) {
				break;
			}
			a++;
		}

		// for(;;)
		// {
		// System.out.println("testing");
		// }

		System.out.println();

		// Prime No.
		int x = 29;
		int counter = 0;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				counter++;
				break;
			}
		}
		if (counter == 0) {
			System.out.println("No is Prime");
		} else {
			System.out.println("Non prime");
		}

		// while loop
		// using variable
		int i = 1;
		while (i < 5) {

			System.out.print(i);
			i++;
		}

		// directly pass true OR false
		// InfiniteLoop
		// while(true)
		// {
		// System.out.println("test");
		// }

		// do while loop
		System.out.println("DoWhile");
		int j = 0;
		do {
			System.out.print(j);
			j++;
		} while (j < 10);
		System.out.println();

		// complex loops
		for (int f = 1, b = 1; f < 5 && b < 5; f++, b++) {
			System.out.println("f=" + f + "And b=" + b);
		}

		int c = 1, d = 1;
		while (i < 5 || d < 5) {
			c++;
			d++;
			System.out.println("c=" + c + "And d=" + d);
		}

		int k = 1, l = 1;
		do {
			k++;
			l++;
			System.out.println("k=" + k + "And l=" + l);
		} while (k < 5 || l < 5);
	}
}
