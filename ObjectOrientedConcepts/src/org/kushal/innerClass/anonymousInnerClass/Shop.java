package org.kushal.innerClass.anonymousInnerClass;

public class Shop {

	public static void main(String[] args) {

		Door door = new Door();
		if (door.getLock().isLocked("qwerty")) {
			System.out.println("Shop Closed");
		} else {
			System.out.println("Shop Open");
		}
		door.getLock().test();
	}

}
