/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass builds columns
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {		
		buildColumn();
		while (frontIsClear()){
			moveToColumn();
			buildColumn();
		}
	}
	
	private void buildColumn(){
		turnLeft();
		while (frontIsClear()){
			placeBeeper();
		}
		turnAround();
		placeBeeper();
		while (frontIsClear()){
			move();
		}
		turnLeft();
	}
	
	private void placeBeeper() {
			if (noBeepersPresent()) {
				putBeeper();
			} else {
				move();
			}
	}
	
	private void moveToColumn() {
		move();
		move();
		move();
		move();
	}
}
