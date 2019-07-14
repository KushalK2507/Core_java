package org.kushal.collections.setsAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapsMain {

	public static void main(String[] args) {

		// 2 Types of Map
		// Unsorted Map
		// Sorted Map --> TreeMap --> Elements sorted on the basis of natural sorting OR
		// use Comparator for custom sorting
		
		// When we are using the HasMap and Linked HashMap the sequence is not gurantee
		
		// If we insert the 2 entries with same Key it replaces the latest entry and old
		// entries would be lost
		Map<Integer, String> student = new HashMap<>();
		student.put(4, "Kushal");
		student.put(6, "Rahul");
		student.put(3, "Nayan");
		student.put(2, "Hello");

		// If both the Key and value in the treeMap are complex object then it called as
		// Entry.
		// Map <Data,DataInteger> data= new HashMap<>();
		// Now to retrieve the data from the entry we will Entry method
		// Map.Entry<Data,DataInteger>.
		// In above Entry<Data,DataInteger> is a dataSet, Each data set consist of the
		// entries present in the Map.

		for (Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("****************");

		System.out.println("Key and value separately");
		for (Map.Entry<Integer, String> entry : student.entrySet()) {
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
		}
		System.out.println("************");
		// Print the value of the specific value, and if we give the key that is not
		// present it will return the null value.
		System.out.println(student.get(2));

		System.out.println("**************");
		// Below keySet() method in the map will return the Set of key present in the
		// map, i.e. in below it will return the Set<Integer> consists of all the keys
		// present in the Map.
		for (Integer element : student.keySet()) {
			System.out.println("Key " + element + " Value " + student.get(element));
		}
		
		// We can also use Iterator to iterate over the HashMap
		Iterator<Entry<Integer, String>> entry=student.entrySet().iterator();
		while(entry.hasNext()) {
			
			System.out.println(entry.next());
			
		}

	}

}
