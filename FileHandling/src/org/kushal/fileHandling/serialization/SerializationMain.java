package org.kushal.fileHandling.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.tools.FileObject;

public class SerializationMain {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Bike", 944);
		Vehicle car = new Vehicle("Car", 4268);

		// If we don't mark the Vehicle class as Serializable then it would
		// Serialization error Vehicle is notSerizableException, then we have mark the
		// Vehicle class as Serializable by implemtating the Serializable interface.
		try (FileOutputStream fos = new FileOutputStream("kushal\\vehicles.dat")) {

			try (ObjectOutputStream outputStream = new ObjectOutputStream(fos)) {

				outputStream.writeObject(bike);
				outputStream.writeObject(car);
				System.out.println("Object written successfully in file");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}
		// The dat file is created is not directly readble but it can be readble using
		// FileInputStream.
		try (FileInputStream fis = new FileInputStream("kushal\\vehicles.dat")) {
			try (ObjectInputStream inputStream = new ObjectInputStream(fis)) {
				Vehicle v1 = (Vehicle) inputStream.readObject();
				Vehicle v2 = (Vehicle) inputStream.readObject();
				System.out.println("Object 1 " + v1);
				System.out.println("Object 2 " + v2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
