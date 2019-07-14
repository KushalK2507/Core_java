package org.kushal.collections.setsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class SetsMain {

	public static void main(String[] args) {

		// Properties of Set
		// Doesn't allow duplicate entries
		// We can iterate to check the element or directly check if element is present
		// or not.
		// the element stored in set are not at the index.

		Set<String> set = new HashSet<>();
		set.add("Kushal");
		set.add("Kushal");
		set.add("Komal");
		set.add("Ved");
		set.add("Uma");

		for (String name : set) {
			System.out.println(name);
		}

		// Mainly 3 types of Set
		// HashSet --> doesn't gurantee any order, allow 1 null key, faster
		// LinkedHashSet --> keeps the order in which elements are added, allow one null key.
		// TreeSet --> sorts all object, doesn't allow null key, slower because of sorting
	}

}

// we can see in output multiple entries are removed.
// the sequence can be any

// Output is below
// Komal
// Ved
// Kushal
// Uma
