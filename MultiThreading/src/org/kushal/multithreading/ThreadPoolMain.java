package org.kushal.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
	private String name;

	public SomeThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println("Starting Thread: " + name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Ended: " + name);
	}
}

// If we want to limit the no. of threads to run simultaneously then ThreadPool
// is solution. It helps to manage the Resources.

public class ThreadPoolMain {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		SomeThread thread1 = new SomeThread("Thread 1");
		SomeThread thread2 = new SomeThread("Thread 2");
		SomeThread thread3 = new SomeThread("Thread 3");
		SomeThread thread4 = new SomeThread("Thread 4");
		SomeThread thread5 = new SomeThread("Thread 5");
		SomeThread thread6 = new SomeThread("Thread 6");
		SomeThread thread7 = new SomeThread("Thread 7");
		SomeThread thread8 = new SomeThread("Thread 8");
		SomeThread thread9 = new SomeThread("Thread 9");
		SomeThread thread10 = new SomeThread("Thread 10");
		SomeThread thread11 = new SomeThread("Thread 11");
		SomeThread thread12 = new SomeThread("Thread 12");
		SomeThread thread13 = new SomeThread("Thread 13");
		SomeThread thread14 = new SomeThread("Thread 14");
		SomeThread thread15 = new SomeThread("Thread 15");

		// thread1.start(); thread2.start(); thread3.start();
		// thread4.start(); thread5.start(); thread6.start();
		// thread7.start(); thread8.start(); thread9.start();
		// thread10.start(); thread11.start(); thread12.start();
		// thread13.start();thread14.start(); thread15.start();

		// To control the thread pool we will not start the thread using thread1.start()
		// instead we will use of executorService.
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);
		executorService.execute(thread6);
		executorService.execute(thread7);
		executorService.execute(thread8);
		executorService.execute(thread9);
		executorService.execute(thread10);
		executorService.execute(thread11);
		executorService.execute(thread12);
		executorService.execute(thread13);
		executorService.execute(thread14);
		executorService.execute(thread15);

		// Now after executing above we can see only 2 threads are running
		// simultaneously, but after all thread executed the application is not
		// terminated as we have not SHUTDOWN the Executor Service.
		// Below shows shutting down the Executor Service.

		executorService.shutdown();

	}

}
