package org.kushal.multithreading;

class MyCounter extends Thread {
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	// We are overriding the run method which is already present in Thread class
	@Override
	public void run() {
		countMe();
	}

	public void countMe() {
		for (int i = 1; i <= 5; i++) {
			// It will stop the process for specific time, this method is available in
			// Thread class
			try {
				sleep(500); // the value inside sleep method is in millisecond
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and the thread number is: " + threadNo);
		}
	}

}

public class MultiThreadingBasicMain {

	public static void main(String[] args) throws InterruptedException {
		// MultiThreading is all about multitasking
		// For each process there are a particular thread.
		// Each thread consist of Runnable state(Thread ready for execution), Running
		// State (Thread is running), Blocking State.

		// After creating the instance of Thread class --> start() method is called and
		// run() method is automatically called by JVM

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);

		long startTime = System.currentTimeMillis();
		// counter1.run(); // By running this nothing is changes and thread 1 is
		// completed then only thread 2 starts, because run() method should be JVM, we
		// need to call start() method
		counter1.start();
		System.out.println("************************************");
		// counter2.run(); // By running this nothing is changes and thread 1 is
		// completed then only thread 2 starts, because run() method should be JVM, we
		// need to call start() method
		counter2.start();
		Thread.sleep(5000); // Adding sleep time to main method
		long endTime = System.currentTimeMillis();
		System.out.println("Total time " + (endTime - startTime));

		// After using the we can see the output is jumbled up i.e. any executed and our
		// application is indeed the multi threaded application
	}

}
