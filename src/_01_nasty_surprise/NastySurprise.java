package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	NastySurprise() {
		JPanel panel = new JPanel();
		frame.add(panel);
		trick.addActionListener(this);
		treat.addActionListener(this);
		panel.add(treat);
		panel.add(trick);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(treat==buttonPressed) {
			label=loadImageFromComputer("scary.png");
			frame.pack();
		}
		
	}
}
