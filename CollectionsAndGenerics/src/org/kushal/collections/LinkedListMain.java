package org.kushal.collections;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {

		// Linked List is memory efficient but slow
		// It contains all the methods used in Array List in addition to some method
		LinkedList<Integer> integers= new LinkedList<>();
		
		// Adding the elements in the linked list
		integers.add(1);
		integers.add(3);
		integers.add(5);
		integers.add(7);
		integers.add(9);
		
		System.out.println(integers);
		System.out.println("*************");
		
		// To add at apecific place
		integers.add(1, 2);
		System.out.println(integers);
		System.out.println("*************");
		
		// INserted at the top of the list
		integers.addFirst(0);
		
		// Inserted at the end of list
		integers.addLast(10);
		
		System.out.println(integers);
		System.out.println("*************");
		
		
	}

}
