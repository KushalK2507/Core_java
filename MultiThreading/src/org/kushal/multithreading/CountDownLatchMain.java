package org.kushal.multithreading;

import java.util.concurrent.CountDownLatch;

class SomeThreadLatch extends Thread {
	private CountDownLatch latch;

	public SomeThreadLatch(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());
		System.out.println("Thread Execution Completed.");
		System.out.println("*************************************");
		// Since the run() methods is called 4 times at every start of thread so this
		// countdown() method is called 4 times and lock is released.
		latch.countDown();
	}
}

public class CountDownLatchMain {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(4);
		SomeThreadLatch thread1 = new SomeThreadLatch(latch);
		SomeThreadLatch thread2 = new SomeThreadLatch(latch);
		SomeThreadLatch thread3 = new SomeThreadLatch(latch);
		SomeThreadLatch thread4 = new SomeThreadLatch(latch);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// Thread.CurrentThread.getName() will return the name of the current thread
		// Latch is the locking mechanism that we apply on the any thread. in this i am
		// applying on the mainThread. In this lock is applied on the main thread and we
		// need to release it also else the application will not terminate.

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// In above we can see there are 4 latch count which we passed while creating
		// the latch object.
		// So unlock the latch we need to unfold it 4 times.
		// Unlock is done

		System.out.println("I am in Thread: " + Thread.currentThread().getName());

	}

}
