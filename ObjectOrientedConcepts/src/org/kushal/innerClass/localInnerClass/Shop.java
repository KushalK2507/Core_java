package org.kushal.innerClass.localInnerClass;

public class Shop {

	public static void main(String[] args) {
		// Local Inner class is class inside the scope of the block(static block OR
		// inside method).

		Door door = new Door();
		if (door.isLocked("test")) {
			System.out.println("Door Locked");
		} else {
			System.out.println("Door Locked");
		}

		if (door.isLocked("qwerty")) {
			System.out.println("Door Opened");
		}

		// In this we will not create the Object of the Door rather directly access the
		// new object as given below

		if (new Door().isLocked("qwerty")) {
			System.out.println("Shop is open");
		}
	}

}
