package org.kushal.innerClass.memberInnerClass;

public class Shop {

	public static void main(String[] args) {
		// Member inner class is a non static class inside the class
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();

	}

}
