package org.kushal.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteInFile {

	public static void main(String[] args) {

		File file = new File("write\\data");
		file.mkdirs();
		file = new File("write\\data\\team.txt");

		// For writing the data into the file we will use Buffered Reader.
		// If we don't mention true as second then every time the data present in the
		// file will be overriden i.e. old data will be erased and new data will be
		// written. to save the old content we passed true which is 2nd parameter and
		// sets true to append the data in the file rather than overwriting it.
		// File Writer automatically creates the file if file does not exist in the path
		// mentioned in File object.
		if (!file.exists()) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
				bw.write("Kushal");
				bw.newLine();
				bw.write("Ved");
				bw.newLine();
				bw.write("Uma");
				bw.newLine();
				bw.write("Komal");
				
				System.out.println("Wrting into the file");
			} catch (Exception e) {
				System.out.println("Error while writing into the file");
				e.printStackTrace();
			}
		}
		// Reading from the content of the file using BufferedReader
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error in reading the file.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("********************");
		// Reading the content of the file using Scanner.
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Deletion of file.
		File fileForDel = new File("Study.txt");
		try {
			fileForDel.createNewFile();
		} catch (IOException e) {
			System.out.println("Error in creating the file");
			e.printStackTrace();
		}
		if (fileForDel.delete()) {
			System.out.println("File is Delted");
		} else {
			System.out.println("Error while deleting");
		}

	}

}
