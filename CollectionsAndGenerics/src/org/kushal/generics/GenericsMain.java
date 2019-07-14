package org.kushal.generics;

class Data {
	private Object obj;

	public Data(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}

}

class GenericClass<T> {
	private T data;

	public T getData() {
		return data;
	}

	public GenericClass(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " [data=" + data + "]";
	}

}

public class GenericsMain {

	public static void main(String[] args) {

		// IN below example the Data class that can accept only Objects types and we
		// need to type case while getting the data from it.
		// In below we are explicity using the type casting which will reduce the
		// performance of the code.
		Data data = new Data("Some String");
		String variable = (String) data.getObj();
		System.out.println(variable);
		System.out.println("*********************");
		// Below is use use of Generic class in which we can use any kind of object.
		// In below we are defining the object creation will be of String
		// type.(GenericClass <String> genricData).

		// But after defining the Object type it still gives warning about the (The
		// constructor GenericClass(Object) belongs to the raw type GenericClass.
		// References to generic type GenericClass<T> should be parameterized) and to
		// solve this we specify the type of data we are passing by giving String while
		// cerating the object as new GenericClass<String>("Some data");.

		// In below we don't need any typecasting, Hence performace increase.
		// In below the type safety is also achieved which is achieved by giving the
		// type of Data while creating the new Object. new GenericClass<String>("Some
		// data");
		GenericClass<String> genricData = new GenericClass<String>("Some data");
		String dataNew = genricData.getData();
		System.out.println(dataNew);
		System.out.println(genricData.toString());

	}

}
