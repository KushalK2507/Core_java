package org.kushal.generics;

// In below have bounded the DataParamter class creates the object by passing only Integer and BoundedParametreMain types of value.
// Below gives the warning as Integer  are the final class. and hence cannot extends further.
class DataParamter<K extends Integer, V extends BoundedParametreMain> {

	private K key;
	private V value;

	public DataParamter(K key, V value) {
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
		return "DataParamter [key=" + key + ", value=" + value + "]";
	}

	// Here we have bounded the parameter to be passed only Number type.
	// Number Type class includes BigDecimal, Interger, Byte, Double and others.
	// We can extends N with any of the custom type
	public <E, N extends Number> void display(E element, N number) {
		System.out.println("Element: " + element + " Number " + number);
	}
}

public class BoundedParametreMain {

	public static void main(String[] args) {

		// In below need to pass only Integer and String only and other type of
		// parameter passed will create the compile time error.
		
		DataParameters<Integer, BoundedParametreMain> data = new DataParameters<Integer, BoundedParametreMain>(1, new BoundedParametreMain());
		data.display("elements", 1);
		System.out.println("**********************************");
		// Now to get access test(), we will use getValue() since BoundedParametreMain class is passed as value in DataParameters class.
		data.getValue().testing();
		
		// data.display("elements", "1"); // This will give compile type error as N
		// number can be only Number since we have extends N to Numbers

	}
	
	public void testing()
	{
		System.out.println("Testing");
	}

}
