package org.kushal.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Reentrant Lock is a locking mechanism that we can apply on the 
//thread so that they cannot run silmultaneously.
// In reentrant lock mechanism is applied when we are working on some 
//common entity which is used by both thte threads, hence the entity is 
//locked and cannot be modified by other thread.
// If there is any exception occured inside the loop then unblock will 
//not be called and the thread will be locked and this causes deadlock in 
//the aaplication, so use always try catch and finally block and unblock 
//the thread in the finally block so the application is not in deadlock condition.
public class ReentrantLockMain {

	static int counter = 0;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				try {

					for (int i = 1; i <= 1000; i++) {
						ReentrantLockMain.counter++;
					}
				} finally {
					lock.unlock();
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				try {

					for (int i = 1; i <= 1000; i++) {
						ReentrantLockMain.counter++;
					}
				} finally {
					lock.unlock();
				}

			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Value of cpounter = " + counter);

	}

}
