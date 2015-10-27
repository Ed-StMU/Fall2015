import javax.swing.*;
import java.awt.*;

public class Scoreboard extends JFrame {

	public Scoreboard() {

		setTitle("Scoreboard");
		setSize(300, 200);
		setLayout(new BorderLayout(5, 10));

		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(3, 2));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();

		JLabel label1 = new JLabel("Red Team");
		label1.setForeground(Color.RED);
		JLabel label2 = new JLabel("Blue Team");
		label2.setForeground(Color.BLUE);

		JLabel label3 = new JLabel("0");
		JLabel label4 = new JLabel("0");

		JButton redButton = new JButton("Red Score!");
		JButton blueButton = new JButton("Blue Score!");
		JButton reset = new JButton("Reset Score");

		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(redButton);
		panel6.add(blueButton);
		gridPanel.add(panel1);
		gridPanel.add(panel2);
		gridPanel.add(panel3);
		gridPanel.add(panel4);
		gridPanel.add(panel5);
		gridPanel.add(panel6);
		add(gridPanel, BorderLayout.CENTER);
		add(reset, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Scoreboard();
	}
}
