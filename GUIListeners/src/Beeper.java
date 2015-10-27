import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Beeper extends JFrame {

	private JButton button = new JButton("0");
	private int count = 0;

	public Beeper() {

		setTitle("Beeper");
		setSize(250, 150);

		button.addActionListener(new ButtonListener());
		add(button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			count++;
			button.setText(Integer.toString(count));
		}
	}

	public static void main(String[] args) {
		new Beeper();
	}
}
