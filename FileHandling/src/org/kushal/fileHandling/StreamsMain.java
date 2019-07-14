package org.kushal.fileHandling;

import java.io.File;
import java.io.IOException;

// There are 3 types of stream in JAVA 
// 1. System.out --> Output Stream --> help us to write files
// 2. System.in --> Input Stream --> help us to read files
// 3. System.err --> Error Stream --> helps us handle to show the error.
// All the above Streams are attached to console.
public class StreamsMain {

	public static void main(String args[]) throws IOException {

		// Create a file
		// By default if we don't give the path then by default it is created inside the
		// root folder of the Project.
		File file = new File("Study.txt");
		file.createNewFile();
		System.out.println("File Created");

		// To give the relative path use below, \\ specifies the escape statement in
		// JAVA.
		// In relative the case is ignored.
		File file1 = new File("src\\Study.txt");
		file1.createNewFile();
		System.out.println("File Created");

		// Creating the directory
		File fileDirectory = new File("kushal");
		fileDirectory.mkdir();
		System.out.println("Directory Created");

		// Creating multiple directory relatively.
		File fileDirectory1 = new File("org\\kushal");
		fileDirectory1.mkdirs();
		System.out.println("Directory Created");

		// Wanted to create file inside org.kushal directory
		File newFile = new File("org\\kushal\\newFile.txt");
		newFile.createNewFile();
		System.out.println("New file created.");

	}
}
