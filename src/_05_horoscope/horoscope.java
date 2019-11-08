package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog(null, "Whats your Star Sign?");
		
		if (sign.equals("aries")) {
			JOptionPane.showMessageDialog(null, "You are Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		}
		else if (sign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "you are Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}
	}

}
