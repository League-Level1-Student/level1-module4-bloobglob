package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JButton add = new JButton("add");
		JButton subtract = new JButton("subtract");
		JButton multiply = new JButton("multiply");
		JButton divide = new JButton("divide");
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
