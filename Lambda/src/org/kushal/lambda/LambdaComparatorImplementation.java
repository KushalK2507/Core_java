package org.kushal.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// In below we have implemented the Comparator with Lambda Expression
class DataLambda {

	private String name;

	public DataLambda(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "DataLambda [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
}

public class LambdaComparatorImplementation {

	public static void main(String[] args) {

		List<DataLambda> list = new ArrayList<>();
		list.add(new DataLambda("Kushal"));
		list.add(new DataLambda("Komal"));
		list.add(new DataLambda("Ved"));
		list.add(new DataLambda("Uma"));

		Collections.sort(list, (DataLambda o1, DataLambda o2) -> {

			if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if (o1.getName().length() < o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}
		});

		for (DataLambda data : list) {
			System.out.println(data);
		}
	}
}
