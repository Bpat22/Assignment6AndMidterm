/*NameCounts.java
 * This program takes input from user and count how many times that
 * name was entered. This program use HashMap concept.
 */

import java.util.*;

public class NameCounts {

	HashMap<String, Integer> hashNames = new HashMap<String, Integer>();
	static String names;
	static int total;
	
	public static void main(String[] args) {
		System.out.println("Enter the name ");
		
		readNames();
		printName();
	}
	
	public void readNames() {
		
		Integer number = (names);
			while (true) {
			names = input.nextLine();
			
			if (names.contains(names) == false) {
				names.put(names, 1);
			}else {
				int total = names.get(names)+ 1;
				names.put(names, total);
			}
			if (names.equals("")) 
				break;
		}
		// put(key, Integer);
	}
	
	public void printName() {
		for(String names : names.keySet()) {
		System.out.println("Entry [ " + names + "] has count " + names.get(names));
		}
	}

}	
	

