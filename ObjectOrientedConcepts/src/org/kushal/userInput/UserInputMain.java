package org.kushal.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) throws IOException {

		System.out.println("What's your name ?");
		Scanner sc = new Scanner(System.in);
		// In this we will take input and print but if your directly press enter then it
		// will print blank name
		String name = sc.nextLine();
		System.out.println("Your name = " + name);

		// In this we will take input and print the name if we press enter then it will
		// not terminate and print the output untill we input some character
		System.out.println("Enter the name");
		String name1 = sc.next();
		System.out.println("Name " + name1);

		// If we have to add the restriction like input should be number or string only,
		// If we give String OR Character then it will give NumberFormatException
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Your age " + age);

		// Taking input through Buffered Reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// This takes Sting as input always
		System.out.println("Enter the String");
		String input1 = br.readLine();
		System.out.println("Entered String is " + input1);

		// In input2 if we give character OR String then it will give
		// NumberFormatException
		System.out.println("Enter the no");
		String input2 = br.readLine();
		// Now if we ant integer input then we need to parse it.
		int num1 = Integer.parseInt(input2);
		System.out.println("No = " + num1);

		sc.close();
	}

}
