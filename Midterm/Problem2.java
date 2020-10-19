/*Problem2.java
 * 
 */
package Midterm;

/*Problem 2 (a)
 * Problem 2--> Simple Java expression
 * 5.0 / 4 - 4 / 5 ---RESULT--> 1.25
 * 5.0 / 4 = 1.25 
 * 4/5 = 0.8 but since Its Integers result will be 0
 * so, it is 1.25 - 0 = 1.25
 * 
 * 7 < 9 - 5 && 3 % 0 == 3 --> False
 * && checks if the first condition is true or false
 * Here 7 < 9 - 5 is false
 * so right will not be calculated, it will be default false
 * 
 * "B" + 8 + 4 -->  B84
 * "B" + 8 = B8
 * B8 + 4 = B84
 */

/* The 1at number is: 78
 * The 2nd number is: 73
 */
import acm.program.*;
public class Problem2 extends ConsoleProgram {
	public void run() {
		int num1 = 2;
		int num2 = 13;
		println("The 1st number is: " + Mystery(num1, 6));
		println("The 2nd number is: " + Mystery(num2 % 5, 1 + num1 * 2));
		
	}
	private int Mystery(int num1, int num2) {
		num1 = Unknown(num1, num2);
		num2 = Unknown(num2, num1);
		
		return(num2);
	}
	private int Unknown(int num1, int num2) {
		int num3 = num1 + num2;
		num2 += num3 * 2;
		return(num2);
	}
}
