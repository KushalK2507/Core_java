package org.kushal.collections.setsAndMaps;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueMain {

	public static void main(String[] args) {

		// It follows FIFO rule, and elements are always inserted at the last(rear
		// position) and removed from first position
		// As FIFO the the elements entered first would leave the first.

		// Types of Queue
		// Array backed queue
		// LinkedList backened queue
		// Blocking Queue
		// Priority Queue --> Sorted elements

		// If there is more operation needs to be handled then we should use LinkedList
		// Queue
		// If there is less operation and needs faster then ArrayQueue is used

		// In linkedBlocking Queue the size is not constant but in Array Blocked Queue
		// we need to assign the size
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);

		for (Integer element : queue) {
			System.out.println(element);
		}

		// To remove the first element from the Queue
		queue.remove();
		queue.poll();

		System.out.println("Display After removal");
		for (Integer element : queue) {
			System.out.println(element);
		}

		System.out.println("Getting Peek Element");
		// To get the first element present in the Queue.
		System.out.println(queue.element());
		System.out.println(queue.peek());

		// IMPORTANT POINTS
		// add(), remove(), element() will give us the exception if element was not
		// added, removed OR not element is present.
		
		//offer () = add()
		//poll() = remove()
		//element() = peek()
		
		// offer(), poll(), peek() will not give the error instead it will return us the value
		// offer() --> true OR false
		// poll() --> returns null if no element present and value of removed element of present
		// peek () --> returns null if no element present and value of first element present in queue

		System.out.println("*******************");

		// Array Blocking Queue in this we need to provide the size, hence this is
		// limitation we cannot add more than 5 elements, if we add more than 5 element
		// then we will get IllegalStackTrace and Queue is full
		// If we remove the element from Empty Queue then we would get NoSuchElement
		// present and Queue is Empty
		Queue<Integer> queueArray = new ArrayBlockingQueue<Integer>(5);
		queueArray.add(1);
		queueArray.add(2);
		queueArray.add(3);
		queueArray.add(4);
		queueArray.add(5);

		for (Integer element : queue) {
			System.out.println(element);
		}

	}

}
