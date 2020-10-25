/*NameCounts.java
 * This program takes input from user and count how many times that
 * name was entered. This program use HashMap concept.
 */

import java.util.*;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram{

	private static HashMap<String, Integer> hashNames = new HashMap<String, Integer>();
	private static Scanner input = new Scanner(System.in);


	public void run() {
		readNames();
		printNames();

	}

	public void readNames() {

		while (true) {
			String name = readLine("Enter name:");
			if (name.equals("")) 
				break;
			if (hashNames.containsKey(name) == false) {
				hashNames.put(name, 1);
			}else {
				int number = hashNames.get(name) + 1;
				hashNames.put(name, number);
			}
		}
	}

	public void printNames() {
		for(String name : hashNames.keySet()) {
			println("Name count for: " + name + " is " + hashNames.get(name) + " times");
		}

	}

}	
	

