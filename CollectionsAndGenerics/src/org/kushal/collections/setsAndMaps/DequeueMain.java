package org.kushal.collections.setsAndMaps;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeueMain {

	public static void main(String[] args) {

		// DEQUEUE stands for double ended queue.
		// IN this add and remove can be done from both the ends

		Deque<Integer> dequeue = new LinkedBlockingDeque<>();
		dequeue.addFirst(1); // Adds from first, return Exception if not added
		dequeue.offerFirst(2);// Add from first, return false if not added
		dequeue.addFirst(3);
		dequeue.offerFirst(4);
		dequeue.addFirst(5);
		dequeue.offerFirst(6);
		dequeue.addFirst(7);
		dequeue.addLast(8); // Add from last, return Exception i not added
		dequeue.offerLast(9); // Add from last, return false if not added
		dequeue.addLast(10);
		dequeue.offerLast(11);

		for (Integer element : dequeue) {
			System.out.print(element + " ");
		}
		// Output --> 7 6 5 4 3 2 1 8 9 10 11

		dequeue.removeFirst(); // removes first element, return Exception if element not present
		dequeue.pollFirst(); // removes first element and returns value of removed element, null if no element removed

		dequeue.removeLast(); // removes last element, returns Exception if no element was present
		dequeue.pollLast(); // removes last element, return the value of removed element, null if no element removed.

		dequeue.peekFirst(); // shows the first element and null if no element is present
		dequeue.getFirst(); // shows the first element, returns Exception if no element is present

		dequeue.peekLast(); // shows the last element and null if no element is present
		dequeue.getLast(); // shows last element, returns exception if no element is present
		
		// All the methods present in Queue are also used in Dequeue and using those method will treat the Dequeue as queue.

	}

}
