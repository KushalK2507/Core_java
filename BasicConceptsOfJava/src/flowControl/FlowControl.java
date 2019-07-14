package flowControl;

public class FlowControl {

	public static void main(String args[]) {

		int x = 5;

		switch (x) {
		case 1:
			System.out.println("Value is x is 1");
			break;
		case 2:
			System.out.println("Value is x is 2");
			break;
		case 3:
			System.out.println("Value is x is 3");
			break;
		case 4:
			System.out.println("Value is x is 4");
			break;
		default:
			System.out.println("Value is x is not 1,2,3,4");
		}

		char y = 'C';
		switch (y) {
		case 'a':
		case 'A':
			System.out.println("Value is a");
			break;
		case 'b':
		case 'B':
			System.out.println("Value is b");
			break;
		case 'c':
		case 'C':
			System.out.println("Value is c");
			break;
		default:
			System.out.println("Value is not A,B,C");

		}

		String name = "Kushal";
		switch (name.toLowerCase()) {
		case "kushal":
			System.out.println("Value is Kushal");
			break;

		case "team":
			System.out.println("Value is Team");
			break;

		case "editor":
			System.out.println("Value is Editor");
			break;
		default:
			System.out.println("Invalid Entry");

		}
	}
}
