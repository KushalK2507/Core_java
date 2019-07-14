package org.kushal.multithreading;

// In my previous class SynchronizationMethodMain we have synchronised the method 
//and we can see the total time taken was around 1800millisec.

// In below we can see there are 2 for loops in 1 for loop we are printing the pattern
//"{" and "}" which should be synchronized so we can get the correct pattern, but in 
//second for loop we are not doing anything which must be synchronized, So we can use 
//the Synchronized block here and Synchronize block will sync only the first loop and 
//all method which reduces the total time required for execution of the whole method.
class BracketsSync {

	public void generate() {
		// Below we implement the sync block
		// Time 6000 millisec
		synchronized (this) {

			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("{");
				} else {
					System.out.print("}");
				}
			}
			System.out.println();
		}
		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private Object lock = "lock";
	// Below is synchronize block on Objects.

	// Whenever we use of synchronize block the monitor lock is applied, this lock
	// need not to be exposed to the outside world and it is recommeded to use the
	// private Object.
	// In below instead of paasing this we used the lock, by using this nothing
	// would be changed overall execution time and all will be the same
	public void generateNew() {
		// Below we implement the sync block
		// Time 6000 millisec
		synchronized (lock) {

			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("{");
				} else {
					System.out.print("}");
				}
			}
			System.out.println();
		}
		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class SynchronizeBlockMain {

	public static void main(String[] args) {

		BracketsSync brackets = new BracketsSync();
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i < 10; i++) {
					brackets.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time Required for Thread 1 is " + (endTime - startTime));
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i < 10; i++) {
					brackets.generateNew();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time Required for Thread 1 is " + (endTime - startTime));
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i < 10; i++) {
					brackets.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time Required for Thread 2 is " + (endTime - startTime));

			}
		}).start();
	}
}
