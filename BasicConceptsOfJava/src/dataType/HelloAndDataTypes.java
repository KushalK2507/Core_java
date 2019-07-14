package dataType;

import java.math.BigDecimal;

public class HelloAndDataTypes {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int value = 1; // declare variable
		System.out.println(value); // output 1
		int value1 = 2, value2 = 2; // multiple variable Initialization
		System.out.println("Value =" + value2);// Output Value =1

		// using Character
		char var = '\u00A7';
		System.out.println(var); // output §

		// Using Big Decimal
		double x = 1.05;
		double y = 1.55;
		System.out.println(x + y); // output --> 2.6
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(1.55);
		System.out.println(d1.add(d2)); // output // 2.6000000000000000888178419700125232338905334472656250
		// for solution use String version of these value in BigDecimal as below
		BigDecimal d3 = new BigDecimal("1.05");
		BigDecimal d4 = new BigDecimal("1.55");
		System.out.println(d3.add(d4)); // output --> 2.60

		// String Details
		String var1 = "Hello \u00BB";
		System.out.println(var1); // output--> Hello »

		// String operation
		String var3 = "10";
		String var4 = "20";
		System.out.println(var3 + var4); // "+ is overloaded operator it can add as well as it can add"
		// output --> 1020

		// String operation
		int var5 = 10;
		String var6 = "20";
		System.out.println(var5 + var6); // "+ is overloaded operator it can add as well as it can add"
		// output --> 1020

		// declaring String
		String var7 = new String("Hello");

		// TypeCasting
		short a = 5;
		int b = a;
		System.out.println(b);// this is called implicit type casting
		// output --> 5

		int c = 5;
		short d = (short) c;
		System.out.println(b);// this is called explicit type casting

	}
}
