package org.kushal.multithreading;

public class InterruptMain {

	static public int balance = 0;

	public void withdraw(int amount) {
		synchronized (this) {
			if (balance < amount) {
				try {
					System.out.println("Waitng for Balance Updation");
					wait();
				} catch (InterruptedException e) {
					System.out.println("Thread Interrupted");
					return;
				}
				balance = balance - amount;
				System.out.println("Withdraw done");
			}
		}
	}

	// Since wait method throws the INtteruption Exception, and in above there is no
	// notify() and wait() is method does not time for resume, we can call the
	// interrupt method, and catch the Exception and can start doing the other task.

	// interrupt() method cannot be called if thread is created using anonymous
	// class i.e. no reference is created for the thread.
	// If there is no wait method then also call to interrupt() method is done, then
	// it would not cause any issue.
	public static void main(String args[]) {
		InterruptMain obj = new InterruptMain();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.withdraw(1000);
			}
		});
		thread1.setName("Thread1");
		thread1.start();
		if (balance <= 0) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			thread1.interrupt();
		}
	}
}