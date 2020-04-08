package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame("Piglatin Translator");
	JPanel panel = new JPanel();
	JTextField text = new JTextField(10);
	JButton button = new JButton("Translate to Piglatin");
	JLabel label = new JLabel();
	void run() {
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.addActionListener(this);
	}
	public static void main(String[] args) {
		new PigLatin().run();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button) {
			panel.remove(label);
			String translation = new PigLatinTranslator().translate(text.getText());
			label.setText(translation);
			panel.add(label);
			frame.pack();
			frame.repaint();
		}
	}
}
