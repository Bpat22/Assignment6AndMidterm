/*Problem1KarelRobot.java 
 * Karel starts bottom left corner of 10/10 world. 
 * Karel make inside border by putting the beeper 
 */
package Midterm;

import stanford.karel.*;

public class Problem1KarelRobot extends SuperKarel{

	public void run() {
		turnAround();
		for (int i = 0; i < 4; i++) {
		putBeep();
		nextPosition();
		}
	}
	public void putBeep() {
		move();
		int numOfBeepers = getBeepersInBag();
		if(numOfBeepers < 100) {
			setBeepersInBag(100);
		}
		while (frontIsClear()) {
			if(noBeepersPresent()) {
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
	
	public void nextPosition() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}
}
