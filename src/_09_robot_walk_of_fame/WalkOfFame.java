
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.moveTo(200, 300);
		rob.setSpeed(100);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int i = 0; i < 4; i++) {
			
		
		for (int i1 = 0; i1 < 10; i1++) {
			rob.setPenWidth(30);
			rob.move(100);
			rob.setRandomPenColor();
			rob.turn(144);
			
		}
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

	private static void pendown() {
		// TODO Auto-generated method stub
		
	}

}
