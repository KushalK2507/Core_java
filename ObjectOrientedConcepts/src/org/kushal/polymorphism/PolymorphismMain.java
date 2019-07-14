package org.kushal.polymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		// Dynamically Binding OR Late Binding

		Phone phone = new Phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.feature();

		Samsung note8 = new Samsung("Note 8");
		System.out.println(note8.getModel());
		note8.feature();

		// IN this the feature method we have overidden the feature method hence on
		// runtime we created the object of SamsungNote8 hence feature method of Samsung
		// Note 8 will be considered
		Phone samsungNote8 = new Samsung("Note 8");
		System.out.println(samsungNote8.getModel());
		samsungNote8.feature();

		// In this the feature method we have note overriden it in Nokia3310 class so we
		// have it will consider the feature method of Phone class. this is called
		// Dynamic Binding
		Phone nokia3310 = new Nokia("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.feature();

		Phone nokia3310New = new PolymorphismMain().phone(1);
		System.out.println(nokia3310New.getModel());
		nokia3310New.feature();

	}

	public Phone phone(int dailyDriver) {
		switch (dailyDriver) {
		case 1:
			return new Nokia("3310");
		case 2:
			return new Samsung("Note 5");
		}
		return null;
	}

}
