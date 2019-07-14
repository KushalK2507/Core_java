package org.kushal.collections.setsAndMaps;

import java.util.Map;
import java.util.TreeMap;

class CodeSearch implements Comparable<CodeSearch> {
	private String sectionNo;
	private String lectureNo;

	public CodeSearch(String sectionNo, String lectureNo) {
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
	public int compareTo(CodeSearch o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo().concat(o.getLectureNo());
		return code1.compareTo(code2);
	}

}

public class SearchMapMain {

	public static void main(String[] args) {
		Map<CodeSearch, String> lectures = new TreeMap<CodeSearch, String>();
		lectures.put(new CodeSearch("S06", "L01"), "Collections");
		lectures.put(new CodeSearch("S02", "L02"), "Operators");
		lectures.put(new CodeSearch("S01", "L02"), "DataTypes"); // same as last
		lectures.put(new CodeSearch("S04", "L01"), "Arrays");
		lectures.put(new CodeSearch("S06", "L02"), "Generics");
		lectures.put(new CodeSearch("S04", "L02"), "Interface");
		lectures.put(new CodeSearch("S01", "L02"), "TypeCasting"); // same as above
		// Searching in Map is easy if we knew the key and need value.
		System.out.println("Value "+lectures.get(new CodeSearch("S06", "L01")));
		
		// But if know the value and need to know they then we need iterate over the Map as below
		System.out.println("*************");
		for (Map.Entry<CodeSearch, String> set : lectures.entrySet()) {
			if(set.getValue().equals("Arrays"))
			{
			System.out.println("Value Found and Key = "+set.getKey());
			}
		}
	}

}
