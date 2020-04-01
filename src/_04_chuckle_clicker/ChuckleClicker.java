package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
	public static void main(String[] args) {
		makeButtons();
	}
	static void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton joke = new JButton("Joke");
		JButton punchline = new JButton("Punchline");
	}
}
