/*Problem3SimpleJava
 * 
 */
package Midterm;

import acm.program.ConsoleProgram;

public class Problem3_SimpleJava extends ConsoleProgram{

	public void run() {

		println("Enter a number: ");

		int largestNum = 0;
		int secondLargestNum = 0;

		while(true) {
			int inputNum = readInt("");
			if (inputNum == 0)
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
