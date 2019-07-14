package org.kushal.innerClass.localInnerClass;

public class Door {

	// The class insode this method is abstract and hidden from outside work
	public boolean isLocked(String key) {
		// Local Inner class is hidden from outisde work
		class Lock {
			public boolean isLocked(String innerKey) {
				if (innerKey.equals("qwerty")) {
					return false;
				} else {
					return false;
				}
			}
		}
		return new Lock().isLocked(key);

	}

}
