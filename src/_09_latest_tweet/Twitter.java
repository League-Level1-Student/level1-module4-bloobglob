package _09_latest_tweet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Twitter {
	void run() {
		JFrame frame = new JFrame("Latest Tweet");
		JPanel panel = new JPanel();
		JTextField text = new JTextField(10);
		JButton button = new JButton("Search the Twitterverse");
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Twitter().run();
	}
}
