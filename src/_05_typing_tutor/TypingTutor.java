package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	char currentLetter;
	TypingTutor() {
	}
	void run() {
		currentLetter = generateRandomLetter();
		JFrame frame = new JFrame("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setText(String.valueOf(currentLetter));
		frame.add(panel);
		panel.add(label);
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}
