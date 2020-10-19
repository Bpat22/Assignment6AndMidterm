/*Problem1KarelRobot.java 
 * Karel starts bottom left corner of 10/10 world. 
 * Karel make inside border by putting the beeper 
 */
package Midterm;

import stanford.karel.*;

public class Problem1KarelRobot extends SuperKarel{

	public void run() {
		turnAround();
		putBeep();
	}
	public void putBeep() {
		move();
		while (beepersInBag()) {
			if(frontIsClear() && noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	public void turnAround() {
		turnLeft();
		move();
		turnRight();
	} 

}
