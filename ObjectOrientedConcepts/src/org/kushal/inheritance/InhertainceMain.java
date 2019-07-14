package org.kushal.inheritance;

public class InhertainceMain {

	public static void main(String[] args) {

		// Inheritance describes "is A" relationship. In inheritance Parent Entity and
		// child Entity shares "is a" relationship i.e. Vehicle and Car(Car is a
		// Vehicle) All the common properties are in Vehicle which is parent class of
		// Car, Bike, Truck.

		// Since we have extended the Vehicle class in Bike so we can access the
		// properties of vehicle class using the object of bike class
		System.out.println();
		System.out.println("********************");
		System.out.println("Setting the properties of parent and child class directly");
		System.out.println("********************");
		BikeChild bike = new BikeChild();
		bike.setHandle("Short");
		bike.setEngine("Petrol");
		bike.setFeulTank(12);
		System.out.println("Bike Handle " + bike.getHandle());
		System.out.println("Bike Engine " + bike.getEngine());
		System.out.println("Bike Seats " + bike.getSeats());
		System.out.println("Biek Light " + bike.getLights());

		// In below code the all the properties are of Vehicle and and Bike is
		// initialized when we create the object of Bike class.
		// Since when Object of Bike is created the default constructor of Bike is
		// invoked by JVM automatically and inside which we are calling super() which is
		// calling the constructor of Vehicle class so properties of Vehicle class is
		// also initialized.
		System.out.println();
		System.out.println("********************");
		System.out.println("Default Constructor");
		System.out.println("********************");
		BikeChild bikeDefaultContructor = new BikeChild();
		System.out.println("Bike DEfault Engine " + bikeDefaultContructor.getEngine());
		System.out.println("Bike DEfault Seat  " + bikeDefaultContructor.getSeats());
		System.out.println("Bike DEfault Handle " + bikeDefaultContructor.getHandle());
		System.out.println("Bike DEfault Light " + bikeDefaultContructor.getLights());

		// Use of Parametrised Constructor
		System.out.println();
		System.out.println("******************************");
		System.out.println("Bike Paramterised Constructor");
		System.out.println("*******************************");
		BikeChild bikeParametrisedConstructor = new BikeChild("long");
		System.out.println("Bike Handle " + bikeParametrisedConstructor.getHandle());
		System.out.println("Bike Engine " + bikeParametrisedConstructor.getEngine());

		// If we need set properties of Parent class then we need to pass that values as
		// well
		System.out.println();
		System.out.println("******************************************");
		System.out.println("Bike Parametrised using Vehicle Properties");
		System.out.println("*******************************************");
		BikeChild bikeParametrisedConstructorWithParent = new BikeChild("long", "deisel", 4, 4, 15, "Bulb");
		System.out.println("Bike Handle " + bikeParametrisedConstructorWithParent.getHandle());
		System.out.println("Bike Engine " + bikeParametrisedConstructorWithParent.getEngine());
		System.out.println("Bike Lights " + bikeParametrisedConstructorWithParent.getLights());

		// Using toString will directly print the Object Hash Value as toString is from
		// java.lang package, We will override toString method in our Child class i.e.
		// BikeChild.
		System.out.println();
		System.out.println("**********************");
		System.out.println("Use of toString Method");
		System.out.println("**********************");
		System.out.println(bikeParametrisedConstructorWithParent);

		// Since run method is not overridden in Bike then when calling run method from
		// bike object it will call run method of vehicle, since it is not overriden in
		// Bike class
		System.out.println("*****************");
		System.out.println("Run method called using Bike Object ");
		bikeParametrisedConstructorWithParent.run();
		System.out.println("*****************");
		// Since run is overidden in Car and Truck class when run method is called using
		// car or truck object run method of Truck and Car is called respectively. In
		// method overriding the method present in child class will get the preference
		// over Parent class.

		CarChild car = new CarChild();
		System.out.println("***************************");
		System.out.println("Run method od car is called");
		car.run();
		System.out.println("****************************");

		TruckChild truck = new TruckChild();
		System.out.println("*****************************");
		System.out.println("Run method of truck is called");
		truck.run();
		System.out.println("******************************");
	}

}
