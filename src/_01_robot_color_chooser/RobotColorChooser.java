//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2 = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like?");
		r2d2.penDown();
		r2d2.setPenWidth(100);
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			r2d2.setPenColor(Color.RED);
		} else {
			if (color.equals("green")) {
				r2d2.setPenColor(Color.GREEN);
			} else {
				if (color.equals("blue")) {
					r2d2.setPenColor(Color.blue);
			} else {
				if (color.equals("pink")) {
					r2d2.setPenColor(Color.PINK);
			} else {
				if (color.equals("")) {
					r2d2.setRandomPenColor();
				}
			}
			}
        //6. If the user doesn’t enter anything, choose a random color
				r2d2.move(100);
				r2d2.turn(90);
				r2d2.move(100);
				r2d2.turn(90);
				r2d2.move(100);
				r2d2.turn(90);
				r2d2.move(100);
				r2d2.turn(90);
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
}
}
