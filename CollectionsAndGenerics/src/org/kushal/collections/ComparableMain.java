package org.kushal.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Names implements Comparable<Names> {

	private String names;

	public Names(String names) {
		this.names = names;
	}

	@Override
	public int compareTo(Names o) {
		if (names.length() == o.names.length()) {
			return 0;
		} else if (names.length() < o.names.length()) {
			return 1;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return names;
	}

}

public class ComparableMain {

	public static void main(String[] args) {

		// Comparable interface contains the compareTo method which can be overriding
		// for custom comparing and sorting as by default Collections class will do the
		// sorting on Natural order.
		

		// Now in above we will override the compareTo method and compare the 2 strings
		// on basis of length.

		List names = new ArrayList<>();
		names.add(new Names("KUSHAL"));
		names.add(new Names("KOMAL"));
		names.add(new Names("VED"));
		names.add(new Names("UMA"));
		names.add(new Names("SHRAY"));

		System.out.println(names);
		System.out.println("***************************");
		Collections.sort(names);
		System.out.println(names);

	}

}
