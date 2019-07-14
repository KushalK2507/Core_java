package org.kushal.innerClass.memberInnerClass;

public class Door {

	// Object of lock class
	private Lock lock;

	public Door() {
		lock = new Lock(true);
	}

	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed");
		} else {
			System.out.println("Welcome, Shop is Open");
		}
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	class Lock {

		// local variable of Lock class
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}
}
