import javax.swing.*;
import java.awt.event.*;

public class TempConverter extends JFrame {

	private JPanel panel;
	private JLabel celsiusLabel;
	private JLabel fahrenLabel;
	private JTextField celsiusText;
	private JTextField fahrenText;
	private JButton button;

	public TempConverter() {

		setTitle("Temperature Converter");

		panel = new JPanel();
		celsiusLabel = new JLabel("Celsius: ");
		fahrenLabel = new JLabel("Fahrenheit: ");
		celsiusText = new JTextField(5);
		fahrenText = new JTextField(5);
		button = new JButton("Convert");
		button.addActionListener(new ButtonListener());

		panel.add(celsiusLabel);
		panel.add(celsiusText);
		panel.add(fahrenLabel);
		panel.add(fahrenText);
		panel.add(button);

		add(panel);
		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str;
			double fahrenheit;

			str = celsiusText.getText();
			fahrenheit = Double.parseDouble(str) * (9.0 / 5) + 32;
			fahrenText.setText(Double.toString(fahrenheit));
		}
	}

	public static void main(String[] args) {
		new TempConverter();
	}
}
