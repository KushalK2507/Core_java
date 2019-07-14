package org.kushal.lambda;

import java.util.ArrayList;
import java.util.List;

class NewData {
	private String name;

	public NewData(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "NewData [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

}

public class LambdaIterateWithCustomObject {

	public static void main(String[] args) {
		List<NewData> list = new ArrayList<>();
		list.add(new NewData("Kushal"));
		list.add(new NewData("Komal"));
		list.add(new NewData("Ved"));
		list.add(new NewData("Uma"));

		list.forEach(name -> System.out.println(name.getName()));
	}

}
