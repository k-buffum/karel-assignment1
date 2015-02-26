/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	public void run() {
		int lastrow = 5;
		while (lastrow != 1){
			q3Beeper();
			moveUp();
			if (frontIsBlocked()){
				lastrow = 1;
				turnRight();
				q3Beeper();
			}
				turnRight();
			checkRightBeeper();
		}
	}
		private void q3Beeper(){
			while (frontIsClear()){
				if (beepersPresent()){
					if (frontIsClear()){
						move();
					}
					if (frontIsClear()){
						move();
						if (noBeepersPresent()){
							putBeeper();
						}
					}
				} else {
					putBeeper();
				}
			}
			turnAround();
			while (frontIsClear()){
				move();
			}
		}
		private void moveUp(){
			turnRight();
			if (frontIsClear()){
				move();
			}
		}
		private void checkRightBeeper(){
			turnRight();
			move();
			if (beepersPresent()){
				turnAround();
				move();
				turnRight();
				move();
			} else {
				turnAround();
				move();
				turnRight();
				
			}
		}
}
