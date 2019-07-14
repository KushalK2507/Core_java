package org.kushal.multithreading;

import java.util.Random;

class MyCounterRunnabel implements Runnable {
	private int threadNo;

	public MyCounterRunnabel(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Value of i: " + i + " Value of thread: " + threadNo);
		}
	}

}

public class MultiThreadingImplementsRunnable {

	public static void main(String[] args) {

		// This is way to create the thread of the class which implements Runnable
		// interface
		// In Runnable interface we have only run() method, and other methods like
		// sleep(), etc are in Thread class which are static methods and can be called
		// directly using Thread class.
		Thread thread1 = new Thread(new MyCounterRunnabel(1));
		Thread thread2 = new Thread(new MyCounterRunnabel(2));

		thread1.start();
		thread2.start();
		// Now at this time the output will be jumbled up and this will depend on our
		// Hardware

		// If we want to make use of Thread only once then we can do it using anonynmous
		// class
		// by doing below whenever we create the object of this class this Thread will
		// execute, in this case since it is present in main class it is automatically
		// created as JVM stars the execution of main() method
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Value of i: " + i);
				}

			}
		}).start();

	}

}
