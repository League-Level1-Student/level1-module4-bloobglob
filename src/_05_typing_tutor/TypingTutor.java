package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	char currentLetter;
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JFrame frame = new JFrame("Type or Die");
	TypingTutor() {
	}
	void run() {
		currentLetter = generateRandomLetter();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(String.valueOf(currentLetter));
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.addKeyListener(this);
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		JFrame keyPressed = (JFrame) e.getSource();
		if(keyPressed == frame) {
			System.out.println("You typed: " + e.getKeyChar());
			if(currentLetter == e.getKeyChar()) {
				System.out.println("correct");
				frame.setBackground(Color.green);
			}else {
				System.out.println("incorrect");
				frame.setBackground(Color.red);
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		JFrame keyReleased = (JFrame) e.getSource();
		if(keyReleased == frame) {
			currentLetter = generateRandomLetter();
			label.setFont(label.getFont().deriveFont(28.0f));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setText(String.valueOf(currentLetter));
		}
	}
}
