package org.kushal.multithreading;

// Wait and Notify is used when one thread execution is dependent on other thread.
//Wait and Notify method must enclosed in synchronised method.

// In below we can use 3 ways:
// we can use the wait(1000) with millisec i.e. thread will wait for specific time then resume thread automatically.
// We can use notify(), this will release the the thread only on one wait() method.
// we can use notifyAll(), this will release all the wait() methods of the current object from which it is invoked.

// notify below will release all the threads which are waiting and invoked with the same object, as in below both the deposit and withdraw method are invoked with same object(obj) 
public class WaitAndNotifyMain {

	static public int balance = 0;

	public void withdraw(int amount) {
		synchronized (this) {

			if (balance < amount) {
				System.out.println("Waiting for Balance Updation");
				try {
					wait();
					// wait(6000); will resume this thread automatically after 6 secs
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
		balance = balance - amount;
		System.out.println("Withdraw done");
}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Balance Updated");
		synchronized (this) {
			notifyAll();
		}
	}

	public static void main(String[] args) {
		WaitAndNotifyMain obj = new WaitAndNotifyMain();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.withdraw(1000);
			}
		});
		thread1.setName("Thread1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				obj.deposit(2000);
			}
		});
		thread2.setName("Thread2");
		thread2.start();
	}

}
