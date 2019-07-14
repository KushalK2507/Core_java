package org.kushal.collections.setsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class CodeTree implements Comparable<CodeTree> {
	private String sectionNo;
	private String lectureNo;

	public CodeTree(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	@Override
	public String toString() {
		return "codeTree [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	public void setLectureNo(String lectureNo) {
		this.lectureNo = lectureNo;
	}

	@Override
	public int compareTo(CodeTree o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo().concat(o.getLectureNo());
		return code1.compareTo(code2);
	}

}

public class TreeMapMain {

	public static void main(String[] args) {

		// In implementaing the TreeMap with Custom object then we need to override the
		// compareTo method and implements Comparable as JAVA didn't know on which basis
		// data needs to be sorted.
		
		// Below out we cannot see the multiple entries of same section and lectures.
		// But in below code can create issues because for Object Comparison we hashcode
		// and equals method is not implemented. this is implemented in
		// HashCodeImplementationMain.

		// In below the duplicate are removed since we are concating the object
		// dataTypes in String and then comparing it
		Map<CodeTree, String> lectures = new TreeMap<CodeTree, String>();
		lectures.put(new CodeTree("S06", "L01"), "Collections");
		lectures.put(new CodeTree("S02", "L02"), "Operators");
		lectures.put(new CodeTree("S01", "L02"), "DataTypes"); // same as last
		lectures.put(new CodeTree("S04", "L01"), "Arrays");
		lectures.put(new CodeTree("S06", "L02"), "Generics");
		lectures.put(new CodeTree("S04", "L02"), "Interface");
		lectures.put(new CodeTree("S01", "L02"), "TypeCasting"); // same as above

		for (Map.Entry<CodeTree, String> set : lectures.entrySet()) {
			System.out.println(set);
		}
	}

}
