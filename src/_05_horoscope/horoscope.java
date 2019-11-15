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
		else if (sign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous");
		} 
		else if (sign.equals("cancer")){
			JOptionPane.showMessageDialog(null, "you are Emotional, group oriented, seeks security, family.");
		}
		else if (sign.equals("leo")) { 
			JOptionPane.showMessageDialog(null, "you are ruled by the Sun.");
		}
		else if (sign.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "you are ruled by Mercury.");
		}
		else if (sign.equals("libra")) {
			JOptionPane.showMessageDialog(null, "you are ruled by Venus.");
		}
		else if (sign.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "you are Passionate, exacting, loves extremes, combative, reflective.");
		}
		else if (sign.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "you are ruled by Jupiter.");
		}
		else if (sign.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "you are ruled by Saturn.");
		}
		else if (sign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "you are Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
		}
		else if (sign.equals("picses")) {
			JOptionPane.showMessageDialog(null, "you are ruled by Neptune");
		}
	}

}
