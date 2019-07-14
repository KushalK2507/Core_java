package org.kushal.collections.setsAndMaps;

import java.util.HashMap;
import java.util.Map;

class Code {
	private String sectionNo;
	private String lecturneNo;

	public Code(String sectionNo, String lecturneNo) {
		super();
		this.sectionNo = sectionNo;
		this.lecturneNo = lecturneNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getLecturneNo() {
		return lecturneNo;
	}

	public void setLecturneNo(String lecturneNo) {
		this.lecturneNo = lecturneNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lecturneNo=" + lecturneNo + "]";
	}

}

public class HasMapObjectMain {

	public static void main(String[] args) {

		// Below HasMap is implemented using Complex Object and we can see the data is not sorted.
		// Below the data is also not overriden even of 2 values of key are same, this can be solved by using TreeMap
		Map<Code, String> lectures = new HashMap<>();
		lectures.put(new Code("S06", "L01"), "Collections");
		lectures.put(new Code("S02", "L02"), "Operators");
		lectures.put(new Code("S01", "L02"), "DataTypes"); //same as last
		lectures.put(new Code("S04", "L01"), "Arrays");
		lectures.put(new Code("S06", "L02"), "Generics");
		lectures.put(new Code("S04", "L02"), "Interface");
		lectures.put(new Code("S01", "L02"), "TypeCasting"); // same as above

		for (Map.Entry<Code, String> set : lectures.entrySet()) {
			System.out.println(set);
		}

	}

}
