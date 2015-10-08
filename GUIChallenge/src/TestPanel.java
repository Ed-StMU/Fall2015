import javax.swing.*;
import java.awt.*;

public class TestPanel extends JFrame {

	public TestPanel() {
		
		setLayout(null);
		setSize(1000, 600);
		setTitle("My Panel");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(800, 600);
		panel.setBackground(Color.RED);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		TestPanel t = new TestPanel();
		System.out.println(t.getContentPane().getSize());
	}
}
