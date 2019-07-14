package org.kushal.generics;



//if we don't applied the bounded type on type T then we will not get the
	// compareTo in overridden method getMyVariable().compareTo
	class DataComparable<T extends Comparable<T>> implements Comparable<T> {
		private T myVariable;

		public T getMyVariable() {
			return myVariable;
		}

		@Override
		public String toString() {
			return "DataComparable [myVariable=" + myVariable + "]";
		}

		public DataComparable(T myVariable) {
			this.myVariable = myVariable;
		}

		@Override
		public int compareTo(T o) {
			return getMyVariable().compareTo(o);

		}

	}

public class ComparableWithGenericsMain {

	public static void main(String[] args) {
		DataComparable<Integer> dataInteger= new DataComparable<Integer>(1);
		System.out.println(dataInteger.compareTo(1));
		
	}
}

