package org.kushal.collections;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		// ArrayLisy is spped efficient but consumes more memory space
		// Array List are non synchronised
		ArrayList<String> listNames = new ArrayList();

		// To add the elements in list
		listNames.add("Kushal");
		listNames.add("Komal");
		listNames.add("Ved");
		listNames.add("Uma");

		// To get the Name from specific position
		System.out.println(listNames.get(0));
		

		// To display full list
		System.out.println(listNames);
		System.out.println("*****************");
		
		// To remove from specific at position
		listNames.remove(0);
		// After removing the first element all the below elements are shifted one
		// position in the arraylist, i.e. in above list Komal will be at 1st position
		System.out.println(listNames.get(0));
		System.out.println(listNames);
		System.out.println("*****************");
		
		// To remvoe specific data
		listNames.remove("Ved");
		System.out.println(listNames);
		System.out.println("*****************");
		
		// Displaying using for-each
		System.out.println("List of names");
		for (String names: listNames)
		{
			System.out.println(names);
		}
		System.out.println("*****************");
		
		// Modify the contents in the list
		listNames.set(1, "Hello");
		System.out.println(listNames);
		
		// To search specific name present in the list
		System.out.println(listNames.contains("Uma"));
		System.out.println("*****************");
		
		// To get the position of specific name, if names is not found then it would return index as -1.
		System.out.println(listNames.indexOf("Komal"));
		System.out.println("*****************");
		

	}

}
