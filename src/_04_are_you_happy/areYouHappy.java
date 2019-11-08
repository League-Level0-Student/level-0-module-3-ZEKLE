package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("are you happy?");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing!");
		}
		else if (happy.equals("no")) {
		String Sad = JOptionPane.showInputDialog("Do you want to be happy? ");
		
			if (Sad.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else if (Sad.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing!");
			}
		}
}
}

	