import java.awt.*;
import javax.swing.*;

public class TestFigurePanel extends JPanel {

	public TestFigurePanel() {
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawLine(10, 10, 100, 50);
		g.drawLine(10, 50, 100, 10);
		g.drawOval(10, 70, 90, 50);
		
		g.setColor(Color.BLUE);
		g.drawRect(125, 7, 100, 50);
		g.fillRect(125, 70, 100, 50);
		
		g.setColor(Color.RED);
		g.drawRoundRect(250, 7, 100, 50, 20, 20);
		g.fillRoundRect(250, 70, 100, 50, 20, 20);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("TestFigurePanel");
		frame.add(new TestFigurePanel());
		frame.setSize(380, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
