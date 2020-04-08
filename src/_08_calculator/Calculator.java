package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField num1 = new JTextField(50);
	JTextField num2 = new JTextField(50);
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	void run() {
		JPanel panel = new JPanel();
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		int int1 = Integer.parseInt(num1.getText());
		int int2 = Integer.parseInt(num2.getText());
		if(buttonPressed == add) {
			label.setText("Answer: " + (int1 + int2));
		}
		if(buttonPressed == subtract) {
			label.setText("Answer: " + (int1 - int2));
		}
		if(buttonPressed == multiply) {
			label.setText("Answer: " + (int1 * int2));
		}
		if(buttonPressed == divide) {
			label.setText("Answer: " + (int1 / int2));
		}
		frame.pack();
		frame.repaint();
	}
}
