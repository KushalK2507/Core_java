package org.kushal.multithreading;

class Brackets {
	// Below method is marked as synchronized so it will execute once only for 1
	// thread
	// Below synchronized method is specific to object, if we have 2 different
	// object used in 2 different threads then we can we can get some wiered output
	// as the output was there before synchronize block
	synchronized public void generate() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i <= 5) {
				System.out.print("{");
			} else {
				System.out.print("}");
			}
		}
		System.out.println();
		
		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// Synchronized method total time is approx 10000 millisec
	}
}

public class SynchronizationMethodMain {

	public static void main(String[] args) {

		Brackets brackets = new Brackets();
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
					brackets.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time Required for Thread 2 is " + (endTime - startTime));

			}
		}).start();

		// By executing this we can get some different pattern on screen as both the
		// threads are executing the same piece of code simultaneously. This is effected
		// by JVM and hardware configuration of your machine

		// To prevent this we will prevent the execution of this generate method
		// simultaneously on multiple threads

	}

}
