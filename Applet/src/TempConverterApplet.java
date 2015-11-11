import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TempConverterApplet extends JApplet {

	JTextField celsiusText;
	JTextField fahrenText;

	public void init() {

		setSize(300, 200);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));

		JLabel fahrenLabel = new JLabel("Fahrenheit Temperature: ");
		JLabel celsiusLabel = new JLabel("Celsius Temperature: ");

		fahrenText = new JTextField(10);
		celsiusText = new JTextField(10);
		celsiusText.setEditable(false);

		JButton button = new JButton("Convert");
		button.addActionListener(new ButtonListener());

		add(fahrenLabel);
		add(fahrenText);
		add(celsiusLabel);
		add(celsiusText);
		add(button);
	}

	public class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str;
			double celsius;
			DecimalFormat df = new DecimalFormat("#.0##");

			str = fahrenText.getText();
			celsius = (Double.parseDouble(str) - 32) * (5.0 / 9);
			celsiusText.setText(df.format(celsius));
		}
	}
}