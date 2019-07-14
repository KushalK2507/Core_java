package org.kushal.multithreading;

public class MultiThreadingSynchronizationMain {

	public static int counter = 0;

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					MultiThreadingSynchronizationMain.counter++;
				}
				System.out.println("Thead 1 is over");
			}
		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					MultiThreadingSynchronizationMain.counter++;
				}
				System.out.println("Thead 2 is over");
			}
		});
		thread2.start();
		// At this instance we are just starting the thread so we can get the value of
		// counter as zero as well
		System.out.println("Counter value " + MultiThreadingSynchronizationMain.counter);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Now we will get the correct output as we made the main() method sleep for 2
		// seconds
		System.out.println("Counter value " + MultiThreadingSynchronizationMain.counter);

		// After running the several time the counter variable may give us inconsistent
		// result, i.e. the value of counter may vary between 1000 and 200 which is
		// issue as the counter variable is common in between both the threads, which
		// cause the issue to solve this issue we can use synchronise() method/ or
		// synchronize the element.
		// Synchronize element will restrict the simulataneous thread to work on it
		// simultaneously
		
		// there are 3 types of Synchronization
			// synchronize method
			// synchronize block
			// static synchronization

	}

}
