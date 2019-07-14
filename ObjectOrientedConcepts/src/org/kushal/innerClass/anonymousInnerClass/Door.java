package org.kushal.innerClass.anonymousInnerClass;

public class Door {

	// Since Lock is the abstract clas JAVA does not allow to create the object of
	// the abstract Hence to access the method of the Abstract class we can use the
	// anonymous inner class and directly overide the abstract method, b
	private Lock lock = new Lock() {

		@Override
		public boolean isLocked(String innerKey) {
			if (innerKey.equals("qwerty")) {
				return false;
			} else {
				return true;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}

}
