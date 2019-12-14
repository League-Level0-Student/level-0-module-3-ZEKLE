package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robots {
	public static void main(String[] args) {
		Robot r2 = new Robot();
		String shape = JOptionPane.showInputDialog(null, "Would you like a square, triangle, or circle?");
		r2.penDown();
		r2.setSpeed(10);
		if(shape.equals("square")) {
		for (int i = 0; i < 4; i++) {
			r2.move(100);
			r2.turn(90);
		} else {
			if(shape.equals("triangle")) {
				for (int i = 0; i < 3; i++) {
					r2.move(100);
					r2.turn(130);
		}
				
				}
				
			}
		
		}

	}
}
	
