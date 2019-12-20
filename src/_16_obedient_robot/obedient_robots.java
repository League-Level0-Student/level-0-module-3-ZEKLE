package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robots {
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog(null, "What shape would you like?");
		String color = JOptionPane.showInputDialog(null, "What color would you like?");
		Robot r2 = new Robot();
		r2.penDown();
		r2.setSpeed(10);
		if (color.equals("red")) {
			r2.setPenColor(Color.RED);
		} else {
			if (color.equals("green")) {
				r2.setPenColor(Color.GREEN);
			} else {
				if (color.equals("blue")) {
					r2.setPenColor(Color.blue);
				}
		if (shape.equals("square")) {
			drawsquare(r2);
		}
		if (shape.equals("triangle")) {
		 drawTriangle(r2);
		}
		if (shape.equals("circle")) {
			drawCircle(r2);
			
		}
			}
		}
		      }
	
	public static void drawsquare(Robot R) {
		R.move(100);
		R.turn(90);
		R.move(100);
		R.turn(90);
		R.move(100);
		R.turn(90);
		R.move(100);
		R.turn(90);
	}
	public static void drawTriangle(Robot O) {
		O.turn(270);
		O.move(100);
		O.turn(120);
		O.move(100);
		O.turn(120);
		O.move(100);
		O.turn(120);
	}
	public static void drawCircle(Robot B) {
		for (int i = 0; i < 360; i++) {
			B.move(1);
			B.turn(1);
		}
	}
}
		
		


