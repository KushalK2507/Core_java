package org.kushal.generics;

import java.util.ArrayList;
import java.util.List;

// Here T stands for Type, i.e. Generic Type.
//The most commonly used type parameter names are:
//E - Element (used extensively by the Java Collections Framework)
//K - Key
//N - Number
//T - Type
//V - Value
//S,U,V etc. - 2nd, 3rd, 4th types
class DataList<T> {
	private T data;

	public T getData() {
		return data;
	}

	public DataList(T data) {

		this.data = data;
	}

	@Override
	public String toString() {
		return "Data [" + data + "]";
	}

}

public class GenericsListMain {

	public static void main(String args[]) {
		List<DataList> elements = new ArrayList<DataList>();
		elements.add(new DataList(1));
		elements.add(new DataList(1.5));
		elements.add(new DataList('a'));
		elements.add(new DataList("acd"));
		System.out.println(elements);

	}

}
