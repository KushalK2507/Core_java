package org.kushal.generics;

class DataParameters<K, V> {
	private K key;
	private V value;

	public DataParameters(K key, V value) {

		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "DataParameters [key=" + key + ", value=" + value + "]";
	}
	
	// Below gives how to use the Generics fields in methods
	public  <E, N> void display (E elements, N numbers)
	{
		System.out.println("Element "+elements+" Number "+numbers);
	}

}

public class ParametersMain {

	public static void main(String[] args) {

		DataParameters<Integer, String> dataParameter = new DataParameters<Integer, String>(1, "Kushal");
		System.out.println("Key: "+dataParameter.getKey()+" Value: "+dataParameter.getValue() );
		System.out.println(dataParameter.toString());
		System.out.println(dataParameter);
		System.out.println("************************************");
		dataParameter.display("1","Hellow");
		dataParameter.display(1,"Hellow");
		

	}

}
