import javax.swing.*;
import java.awt.*;

public class ColorPanels extends JFrame {

	public ColorPanels() {

		setLayout(null);
		setSize(400, 250);
		setTitle("Color Panels");

		JPanel main = new JPanel();
		main.setLayout(null);
		main.setSize(400, 250);
		main.setBackground(Color.BLACK);

		JPanel p1 = new JPanel();
		p1.setSize(80, 100);
		p1.setLocation(25, 50);
		p1.setBackground(Color.RED);

		JPanel p2 = new JPanel();
		p2.setSize(80, 100);
		p2.setLocation(150, 50);
		p2.setBackground(Color.BLUE);

		JPanel p3 = new JPanel();
		p3.setSize(80, 100);
		p3.setLocation(275, 50);
		p3.setBackground(Color.YELLOW);

		JLabel rLabel = new JLabel("Red");
		rLabel.setBounds(55, 25, 25, 25);
		rLabel.setForeground(Color.RED);

		JLabel bLabel = new JLabel("Blue");
		bLabel.setBounds(175, 25, 50, 25);
		bLabel.setForeground(Color.BLUE);

		JLabel yLabel = new JLabel("Yellow");
		yLabel.setBounds(296, 25, 50, 25);
		yLabel.setForeground(Color.YELLOW);

		JButton rButton = new JButton("Red");
		rButton.setBounds(36, 160, 60, 25);

		JButton bButton = new JButton("Blue");
		bButton.setBounds(155, 160, 70, 25);

		JButton yButton = new JButton("Yellow");
		yButton.setBounds(280, 160, 72, 25);

		add(main);
		main.add(p1);
		main.add(p2);
		main.add(p3);
		main.add(rLabel);
		main.add(bLabel);
		main.add(yLabel);
		main.add(rButton);
		main.add(bButton);
		main.add(yButton);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ColorPanels c = new ColorPanels();
	}
}
