package org.kushal.collections.setsAndMaps;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchingSortingInSetsMain {

	public static void main(String args[]) {
		Set<String> set = new HashSet<>();
		set.add("Kushal");
		set.add("Kushal");
		set.add("Komal");
		set.add("Ved");
		set.add("Uma");

		for (String name : set) {
			System.out.println(name);
		}
		System.out.println("*************");

		// Set, List, Queue all these are have the parent class as Collections.
		// addAll() method is from Collection which add the whole set OR Queue to
		// another collection

		// In below list we can see Kushal is present only once even List don't have
		// restriction, since first we are saving the names in Set hence duplicacy is
		// removed there only.
		List<String> list = new ArrayList<>();
		list.addAll(set);

		System.out.println("Printing List");
		for (String name : list) {
			System.out.println(name);
		}

		// Sorting the list.
		// For sorting on custom objects we need to implement Comparator and Comparable
		Collections.sort(list);

		System.out.println("*****************");
		// We also have Binary Searching implemented in Collection class
		
		// Internally binarySearch uses compareTo() method for searching so if we are
		// using the customer Objects in list then we to implement Comparable
		
		System.out.println(Collections.binarySearch(list, "ACV")); // If data is present it returns the index value of
		// the data present and -1(any negative value) if data not present
		
		
	}

}
