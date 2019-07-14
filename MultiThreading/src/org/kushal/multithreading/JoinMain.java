package org.kushal.multithreading;

public class JoinMain {

	public int counter = 0;

	public static void main(String[] args) {

		JoinMain obj = new JoinMain();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					obj.counter++;
				}

			}
		});
		thread1.setName("Thread1");
		thread1.start();
		// In below main thread is running simulataneously with the Thread1 hence no
		// output is shown.
		// In below the join() method will make the join with reference from which it is
		// invoked (i.e. thread1) with the current thread.
		// As in below the join() is the part of main method hence it will join the
		// main() method and thread1.
		// Hence main() method will wait untill the execution of thread1 is not
		// finished.
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Value of counter: " + obj.counter);
	}
}
