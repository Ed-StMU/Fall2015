import javax.swing.*;
import java.awt.event.*;
import java.text.*;

public class TempRadioConverter extends JFrame {

	private JTextField text1;
	private JTextField text2;

	public TempRadioConverter() {

		super("Temperature Converter");
		JPanel panel = new JPanel();

		JLabel label = new JLabel("Enter a value in Celsius or Fahrenheit");
		text1 = new JTextField(5);
		text2 = new JTextField(5);
		text2.setEditable(false);

		JRadioButton radio1 = new JRadioButton("Convert to Fahrenheit", true);
		JRadioButton radio2 = new JRadioButton("Convert to Celsius");
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);

		panel.add(label);
		panel.add(text1);
		panel.add(radio1);
		panel.add(radio2);
		panel.add(text2);

		add(panel);
		pack();

		radio1.addActionListener(new ConvertToFahrenheit());
		radio2.addActionListener(new ConvertToCelsius());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class ConvertToFahrenheit implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str;
			double fahrenheit;
			DecimalFormat df = new DecimalFormat("#.0#");

			str = text1.getText();
			fahrenheit = Double.parseDouble(str) * (9.0 / 5) + 32;
			text2.setText(df.format(fahrenheit));
		}
	}

	public class ConvertToCelsius implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str;
			double celsius;
			DecimalFormat df = new DecimalFormat("#.0#");

			str = text1.getText();
			celsius = (Double.parseDouble(str) - 32) * (5.0 / 9);
			text2.setText(df.format(celsius));
		}
	}

	public static void main(String[] args) {
		new TempRadioConverter();
	}
}
