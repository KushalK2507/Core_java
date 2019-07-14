package org.kushal.inheritanceExcerise;

public class MainIneritanceExcerise {

	public static void main(String args[]) {

		System.out.println("**********************");
		System.out.println("Crocodile giving default properties value of Reptile and Animals");
		Crocodile crocodileDefaultConstructor = new Crocodile();
		System.out.println(crocodileDefaultConstructor);
		System.out.println("***********************");

		System.out.println("*************************");
		System.out.println("Crocodile giving its own value for all properties");
		Crocodile crocodileParameterisedConstructor = new Crocodile(5, 1, "Reptile", "Cold Blodded", "Hard Skin", true);
		System.out.println(crocodileParameterisedConstructor);
		System.out.println("********************************");
		
		
	}

}
