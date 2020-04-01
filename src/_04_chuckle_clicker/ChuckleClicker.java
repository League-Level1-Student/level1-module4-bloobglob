package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ChuckleClicker() {
	}
	void run() {
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == joke) {
			JOptionPane.showMessageDialog(null, "Today, my son asked 'Can I have a book Mark?' and I burst into tears. 11 years old and he still doesn't know my name is Brian.");
		}
		if(buttonPressed == punchline) {
			JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he doesn’t want to be spotted.");
		}
	}
}
