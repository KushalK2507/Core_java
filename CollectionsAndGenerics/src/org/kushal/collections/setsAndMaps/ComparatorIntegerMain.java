package org.kushal.collections.setsAndMaps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyData implements Comparator<MyData> {

	private int rollNo;
	private String name;
	private double marks;

	public MyData() {

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "MyData [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public MyData(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	// CompareTo methods cannot be primitive dataType, we need to invoke the
	// compareTo method with object i.e. for int types we need wrapper class of it.
	// We need object as methods are invoked by object only and not primitive dataType

	@Override
	public int compare(MyData data1, MyData data2) {

		return ((Integer) data1.getRollNo()).compareTo(data2.getRollNo());

	}

}

public class ComparatorIntegerMain {

	public static void main(String args[]) {
		List<MyData> myData = new ArrayList<>();
		myData.add(new MyData(1, "ABC", 12.5));
		myData.add(new MyData(5, "DEF", 12.5));
		myData.add(new MyData(2, "GFFD", 154.5));
		myData.add(new MyData(88, "AAA", 11.5));
		myData.add(new MyData(4, "FDS", 42.5));
		/*
		 * for (MyData data: myData) { System.out.println(data); }
		 */
		Collections.sort(myData, new MyData());

		for (MyData data : myData) {
			System.out.println(data);
		}

	}

}
