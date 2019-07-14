package org.kushal.collections.setsAndMaps;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class DataComparator<K, V> {
	private K key;
	private V value;

	public DataComparator(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DataComparator [key=" + key + ", value=" + value + "]";
	}

}

public class ComparatorMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// This will work fine
		Set<DataComparator> set = new LinkedHashSet<>();
		set.add(new DataComparator("KEY", "value"));
		set.add(new DataComparator("1", "one"));

		set.add(new DataComparator("3", "THREE"));
		set.add(new DataComparator("4", "FOUR"));
		set.add(new DataComparator("2", "TWO"));

		for (DataComparator element : set) {
			System.out.println(element);
		}

		// In below we will face the run time error as TreeSet stores the data in sorted
		// way, to overcome this we use Comparator as to sort the things as Comparable
		// will not work here as in Comparable we can only sort the things with 1 type
		// and here we can use multiple type
		// Set<DataComparator> treeSet = new TreeSet<>();
		// treeSet.add(new DataComparator("KEY", "value"));
		// treeSet.add(new DataComparator("1", "one"));
		// treeSet.add(new DataComparator("2", "TWO"));
		// treeSet.add(new DataComparator("3", "THREE"));
		// treeSet.add(new DataComparator("4", "FOUR"));
		//
		// for (DataComparator element : treeSet) {
		// System.out.println(element);
		// }

		System.out.println("*************************************");

		// below is the way to overcome the above problem
		// we will create the Comparator and object Oand override the compare method as below
		// In below we have impleted only to TreesSet we can use any Object to overide
		// the compare method, see Example ComparatorIntegerMain for more understanding
		Comparator<DataComparator<Integer, String>> Compare_Key = new Comparator<DataComparator<Integer, String>>() {

			@Override
			public int compare(DataComparator<Integer, String> obj1, DataComparator<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Set<DataComparator<Integer, String>> treeSet1 = new TreeSet<>(Compare_Key);

		treeSet1.add(new DataComparator<Integer, String>(1, "one"));
		treeSet1.add(new DataComparator<Integer, String>(2, "TWO"));
		treeSet1.add(new DataComparator<Integer, String>(3, "THREE"));
		treeSet1.add(new DataComparator<Integer, String>(4, "FOUR"));

		for (DataComparator<Integer, String> element : treeSet1) {
			System.out.println(element);
		}

	}

}
