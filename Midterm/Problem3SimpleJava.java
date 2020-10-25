/*Problem3SimpleJava
 * 
 */
package Midterm;

import acm.program.ConsoleProgram;

public class Problem3SimpleJava extends ConsoleProgram{

	private static final int SENTINEL = 0;
	
	public void run() {

		println("This program finds the two largest integers in a");
		println("list. Enter values, one per line, using a " + SENTINEL + " to");
		println("signal the end of the list.");
		
		
		int largestNum = -1;
		int secondLargestNum =-1;

		while(true) {
			int inputNum = readInt("Enter number");
			if (inputNum == SENTINEL)
				break;
			if (inputNum > largestNum){
				secondLargestNum = largestNum;
				largestNum = inputNum;
			}else if (inputNum > secondLargestNum) {
				secondLargestNum = inputNum;
			}
		}
		println("The larget number is: ");

		println("The second larget number is: " + secondLargestNum);
	}
}
