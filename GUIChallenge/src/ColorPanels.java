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

		JPanel p1 = new JPanel();
		p1.setSize(80, 100);
		p1.setLocation(25, 50);
		p1.setBackground(Color.RED);

		JPanel p2 = new JPanel();
		p2.setSize(80, 100);
		p2.setLocation(150, 50);
		p2.setBackground(Color.GREEN);

		JPanel p3 = new JPanel();
		p3.setSize(80, 100);
		p3.setLocation(275, 50);
		p3.setBackground(Color.YELLOW);

		JLabel r = new JLabel("Red");
		r.setSize(25, 25);
		r.setLocation(55, 25);

		JLabel g = new JLabel("Green");
		g.setSize(50, 25);
		g.setLocation(174, 25);

		JLabel y = new JLabel("Yellow");
		y.setSize(50, 25);
		y.setLocation(296, 25);

		JButton rButton = new JButton("Red");
		rButton.setSize(60, 25);
		rButton.setLocation(36, 160);
		
		JButton gButton = new JButton("Green");
		gButton.setSize(70, 25);
		gButton.setLocation(155, 160);
		
		JButton yButton = new JButton("Yellow");
		yButton.setSize(72, 25);
		yButton.setLocation(280, 160);
		
		add(main);
		main.add(p1);
		main.add(p2);
		main.add(p3);
		main.add(r);
		main.add(g);
		main.add(y);
		main.add(rButton);
		main.add(gButton);
		main.add(yButton);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ColorPanels c = new ColorPanels();
	}
}
