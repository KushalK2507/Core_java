package org.kushal.string;

public class StringMain {

	public static void main(String[] args) {

		String x = "Kushal";
		String y = " Kesarwani";

		String z = x + y;

		// In below == compares the object reference and in string variable the
		// reference of
		// the value is stored and not the orignal value. Hence in below code it gives
		// false

		if (z == "Kushal Kesarwani") {
			System.out.println("Condition True");
		} else {
			System.out.println("Condition is false");
		}

		// In String gave the function equals() which compares the value in stored in
		// that reference.Hence below code gives true
		if (z.equals("Kushal Kesarwani")) {

			System.out.println("Condition True");
		} else {
			System.out.println("Condition is false");
		}

		String x1 = "abc";
		String y1 = "abc";
		// IN String if 2 String variable have same value then both the variable with
		// create only 1 memory space in Heap and save same value of that memory in Heap

		// In above statement since x1 and y1 are same and the variable contains same
		// reference, Hence returns true
		if (x1 == y1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String x2 = new String("abc");
		String y2 = new String("abc");
		// Now if we create 2 String objects then it will create 2 diiferent objects in
		// heap and reference value stored in variable in stack will be different as
		// there are 2 differnt memory in Heap.

		// In above statement it will return false since both the String vaalue are same
		// but the object created in Heap are different and values stored in variable
		// i.e. the address in Stack are different. hence it will return false.
		if (x2 == y2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// If we have used equals() then it have returned true since equals() compares
		// the value and not the reference address
		if (x2.equals(y2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
