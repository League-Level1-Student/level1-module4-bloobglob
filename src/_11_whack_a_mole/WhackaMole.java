package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	Date date = new Date();
		JButton mole = new JButton("mole");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		int score = 0;
		int moleLocation;
	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(240, 300);
		setUpPanel();
		frame.setVisible(true);
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	void setUpPanel() {
		mole.addActionListener(this);
		panel = new JPanel();
		frame.add(panel);
		moleLocation = new Random().nextInt(24);
		for(int i = 0; i < moleLocation; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
		}
		panel.add(mole);
		for(int i = moleLocation+1; i<24;i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
		}
		frame.repaint();
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	public static void main(String[] args) {
		new WhackaMole().run();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed!=mole) {
			speak("You clicked the wrong button!");
		}
		if(mole==buttonPressed) {
			score++;
			if(score>=10) {
				endGame(date, 10);
			}else {
				frame.dispose();
				frame = new JFrame();
				run();
			}
			System.out.println(score);
		}
	}
}
