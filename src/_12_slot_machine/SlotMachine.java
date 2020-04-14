package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JButton spin = new JButton("spin!");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel slot1 = new JLabel();
	JLabel slot2 = new JLabel();
	JLabel slot3 = new JLabel();
	void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(spin);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		spin.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new SlotMachine().run();
	}
	void setSlots(int random, JLabel slot) {
		if(random==0) {
			slot.setIcon(setImageIcon("cherry.png"));
		}else if(random==1) {
			slot.setIcon(setImageIcon("lime.jpg"));
		}else {
			slot.setIcon(setImageIcon("orange.png"));
		}
	}
	public Icon setImageIcon(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return icon;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==spin) {
			int image1 = new Random().nextInt(3);
			int image2 = new Random().nextInt(3);
			int image3 = new Random().nextInt(3);
			setSlots(image1, slot1);
			setSlots(image2, slot2);
			setSlots(image3, slot3);
			frame.repaint();
			frame.pack();
			if(image1==image2 && image2==image3) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}
		}
	}
}

