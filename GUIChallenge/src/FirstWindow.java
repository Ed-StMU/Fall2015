import javax.swing.*;

public class FirstWindow {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Window");
		JButton button = new JButton("OK");
		frame.add(button);
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}