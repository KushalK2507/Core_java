package org.kushal.multithreading;

public class VolatileKeywordMain {

	volatile public static int flag = 0;

	// In below some times the flag value is cached and and Thread will not consider
	// the updated the value of flag which is updated from different falg which
	// leads to problem.

	// To solve this problem we use the volatile keyword. So this cache is very rare
	// so best way to overcome is the volatile keyword with the data memeber.
	
	// Its best practise to use the volatile keyword for the data memeber if any
	// thread execution is dependent on the data member.
	
	//When we mark any variable as volatile then that varaible is not cached by the thread.
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (flag == 0) {
						System.out.println("Running");
					} else {
						break;
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				flag = 1;
				System.out.println("Flag Value Updated");
			}
		}).start();
	}

}
