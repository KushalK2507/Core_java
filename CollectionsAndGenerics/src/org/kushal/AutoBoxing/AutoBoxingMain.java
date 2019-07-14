package org.kushal.AutoBoxing;

import java.util.ArrayList;


public class AutoBoxingMain {

	public static void main(String[] args) {

		ArrayList<Integer> studentRollNos= new ArrayList<>();
		studentRollNos.add(25); // autoboxing
		// In above JAVA automatically do the boxing for int primative data type to Wropper class Integer.
		// Below explained how JAVA do the autoboxing
		studentRollNos.add(Integer.valueOf(25));// Internally JAVA uses this for Autoboxing
		
		studentRollNos.get(0); // Auto unboxing
		//Below explained how JAVA do the un boxing internally.
		studentRollNos.get(0).intValue(); // Internally JAVA uses this for Auto unboxing
		
		
		// All these above boxing and unboxing by JAVA Internally done for all the primivite data types.
	}

}
