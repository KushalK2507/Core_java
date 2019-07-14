package org.kushal.collections.setsAndMaps;

import java.util.Map;
import java.util.TreeMap;

class CodeHashCode implements Comparable<CodeHashCode> {

	private String sectionNo;
	private String lectureNo;

	public CodeHashCode(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
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
	public String toString() {
		return "CodeHashCode [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(CodeHashCode o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo().concat(o.getLectureNo());
		return code1.compareTo(code2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeHashCode other = (CodeHashCode) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}
	
	

}

public class HashCodeImplementationMain {

	public static void main(String[] args) {

		Map<CodeHashCode, String> lectures = new TreeMap<>();
		lectures.put(new CodeHashCode("S06", "L01"), "Collections");
		lectures.put(new CodeHashCode("S02", "L02"), "Operators");
		lectures.put(new CodeHashCode("S01", "L02"), "DataTypes"); // same as last
		lectures.put(new CodeHashCode("S04", "L01"), "Arrays");
		lectures.put(new CodeHashCode("S06", "L02"), "Generics");
		lectures.put(new CodeHashCode("S04", "L02"), "Interface");
		lectures.put(new CodeHashCode("S01", "L02"), "TypeCasting"); // same as above

		// When we compare any 2 objects in backend JAVA compares there HashCode
		String name1 = new String("Kushal");
		String name2 = new String("Kushal");
		System.out.println("Name1 hash " + name1.hashCode() + " Name2 hash " + name2.hashCode());// If we see the
																			// hashcode of both the are equal.
		
		System.out.println(name1.equals(name2)); // It returns true as String class override the Equal method and
													// hascode method

		CodeHashCode code1 = new CodeHashCode("S06", "L01");
		CodeHashCode code2 = new CodeHashCode("S06", "L01");
		System.out.println("Code1 Hash " + code1.hashCode() + " Code2 hash " + code2.hashCode()); // If we see the
																			// hashcode of both the are not equal.
		System.out.println(code1.equals(code2)); // It returns false as custom class don't override the equals method
		// and hashcode method, To overcome this we can overide the hascode and equal methods in 
		//our custom class that can be done by Eclipse--> Source --> generate
		
		// Never use == operator in comparison of object
		
		// Now since we overriden the hashcode and equal method then we don't have the duplicay in out TreeMap
		for (Map.Entry<CodeHashCode, String> set : lectures.entrySet()) {
			System.out.println(set);
		}
	}

}
