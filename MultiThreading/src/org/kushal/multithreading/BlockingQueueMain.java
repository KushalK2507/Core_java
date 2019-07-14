package org.kushal.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

// In below example we are adding the element to the Queue every second and 
//removing the element at every 5 seconds.
class Producer implements Runnable {

	// ArrayBlockingQueue is thread safe Queue, so when the size of the Queue is
	// full it will stop inserting the element but it will wait untill there is more
	// space of insertion and vice versa if the deletion is done and Queue is empty
	// then it will wait untill data is inserted to queue then it will removed, our
	// application will not terminate.

	// In below change the sleep timer of producer to 1sec and consumer to 5 sec to
	// insertion criteria.
	private ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
				System.out.println("Adding Value: " + BlockingQueueMain.counter);
				queue.put(BlockingQueueMain.counter++);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	private ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);

				queue.take();
				BlockingQueueMain.counter--;
				System.out.println("Removing Value: " + BlockingQueueMain.counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

// Blocking Queue is Thread Safe collection.
public class BlockingQueueMain {

	static int counter = 0;

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		Producer producer = new Producer(queue);
		Thread produceThread = new Thread(producer);
		produceThread.start();

		Consumer consume = new Consumer(queue);
		Thread consumerThread = new Thread(consume);
		consumerThread.start();
	}

}
