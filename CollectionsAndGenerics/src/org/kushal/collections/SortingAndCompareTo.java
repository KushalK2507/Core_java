package org.kushal.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAndCompareTo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("INDIA");
		names.add("USA");
		names.add("THAILAND");
		names.add("CANADA");
		names.add("HONG KONG");
		names.add("NEPAL");
		names.add("ENGLAND");
		names.add("AUSTRALIA");

		System.out.println(names);
		System.out.println("************************************************************************************");
		// By default sort method sorts the list on alphabatic order, and in case of
		// Integer it will numerical sort
		names.sort(null);
		System.out.println(names);
		System.out.println("*************************************************************************************");

		// To reverse the list we can use the reverse method given by Collections
		// class., it would reverse the list i.e. last element would be the first and
		// vice-versa
		Collections.reverse(names);
		System.out.println(names);

		// CompareTo method
		// if part1(part before compareTo method) < part 2, then -1
		// if part 1 > part 2, then 1
		// if part 1 = part 2, then 0.
		// CompareTo will work only on Objects and will not work on primtive Data types,
		// i.e in below example if x and y are int then it would give compile time
		// error, to use we need to use Wrapper class of class i.e Integer class.
		String x = "a";
		String y = "b";
		System.out.println(x.compareTo(y));// Output is -1.

	}

}
