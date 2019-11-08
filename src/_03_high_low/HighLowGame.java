//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = (1);
		random = new Random().nextInt(100);
		for (int i = 0; i < 10; i++) {
			
		
		
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String answer = JOptionPane.showInputDialog("give me a number between 1 - 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answer1 = Integer.parseInt(answer);
			// 5. if the guess is correct
				// 6. Win
			if (random == answer1) {
				JOptionPane.showMessageDialog(null, "You Win!");
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if (answer1 > random) {
				JOptionPane.showMessageDialog(null, "You Guessed to High!");
				JOptionPane.showMessageDialog(null, "You Lose!");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			else if (answer1 < random) {
				JOptionPane.showMessageDialog(null, "You Guessed to Low!");
				JOptionPane.showMessageDialog(null, "You Lose!");
			}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}

}
