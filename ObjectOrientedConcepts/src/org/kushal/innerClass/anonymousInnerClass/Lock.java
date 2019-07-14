package org.kushal.innerClass.anonymousInnerClass;

public abstract class Lock {

	public abstract boolean isLocked(String innerKey);

	public void test() {
		System.out.println("Lock Testing");
	}

}
