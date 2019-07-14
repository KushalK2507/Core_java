package org.kushal.collections;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {

		// Satck are synchronised and extension of Vector
		// vecor are same list ArrayList, but ArrayList in not synchronised whereas Vector are synchronised
		// STACK follows LIFO i.e. last IN First Out
		Stack<String> books = new Stack<>();
		books.push("History");
		books.push("Geo");
		books.push("Math");
		books.push("Physics");
		books.push("Chem");
		
		for(String book:books)
		{
			System.out.println(book);
		}
		System.out.println("*************************");
		books.pop();
		for(String book:books)
		{
			System.out.println(book);
		}
		System.out.println("*************************");
		// Returns the last inserted element in the stack
		System.out.println(books.peek());
		
		System.out.println("*************************");
		//Below search method retrun the index at which Math object is present.
		System.out.println(books.search("Math"));
		
		System.out.println("*************************");
		System.out.println(books.isEmpty());
		
	}

}
