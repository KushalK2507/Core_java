package org.kushal.generics;

import java.util.ArrayList;
import java.util.List;

class DataMethods {
	public <E> void printList(List<E> list) {
		for (E element : list) {
			System.out.print(element);
		}

	}

	public <E> void printArray(E[] arrayData) {
		for (E e : arrayData) {
			System.out.print(e);
		}
	}
}

public class GenericMethodMain {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		DataMethods data = new DataMethods();
		data.printList(list);
		System.out.println();
		System.out.println("***********************");

		List<String> list2 = new ArrayList<>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		data.printList(list2);
		System.out.println();
		System.out.println("***********************");

		String stringArray[] = { "ONE", "FIVE", "TEN", "FIFTEEN" };
		data.printArray(stringArray);
		System.out.println();
		System.out.println("***********************");

	}

}
