package org.kushal.multithreading;

class BracketsSyncObject {

	private Object lock = "lock";
	// Below is synchronize block on Objects.

	// Whenever we use of synchronize block the monitor lock is applied, this lock
	// need not to be exposed to the outside world and it is recommeded to use the
	// private Object.
	// In below instead of paasing this we used the lock, by using this nothing
	// would be changed overall execution time and all will be the same as we are
	// doing using the this keyword, as the lock is hidden
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

public class SyncBlockObjectMain {

	public static void main(String[] args) {

		BracketsSyncObject brackets = new BracketsSyncObject();
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
					brackets.generateNew();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time Required for Thread 1 is " + (endTime - startTime));
			}
		}).start();

	}
}
