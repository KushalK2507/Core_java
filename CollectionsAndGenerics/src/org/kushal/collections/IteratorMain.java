package org.kushal.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {

		// Iterators are used for iterating over the list

		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		names.add("G");
		names.add("H");
		names.add("I");

		Iterator<String> iter = names.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// List Iterator extends Iterator which implemts some additional methods like
		// hasPrevious() nad previous().
		ListIterator<String> listIter = names.listIterator();
		while (listIter.hasNext()) {
			if (listIter.hasPrevious())
				System.out.println(listIter.previous());

			System.out.println(listIter.next());
			listIter.next();// Without this this will be infinite loop as previous() makes one element back
							// and makes next() makes 1 element move forward
		}

		// While using for-each for iterating over the list, we cannot modify the list
		// same time while iterating over the list, by doing this it would give
		// Concurrent modification Exception
		// But while using the iterator we can modify the main list elements while
		// iterating over the list.
		
		

	}

}
