import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Scoreboard extends JFrame {

	private int redScore = 0;
	private int blueScore = 0;
	private JLabel redScoreLabel = new JLabel("0");
	private JLabel blueScoreLabel = new JLabel("0");

	public Scoreboard() {

		super("Scoreboard");
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

		JButton redButton = new JButton("Red Score!");
		JButton blueButton = new JButton("Blue Score!");
		JButton reset = new JButton("Reset Score");
		redButton.addActionListener(new AddRedScore());
		blueButton.addActionListener(new AddBlueScore());
		reset.addActionListener(new ResetScore());

		panel1.add(label1);
		panel2.add(label2);
		panel3.add(redScoreLabel);
		panel4.add(blueScoreLabel);
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

	public class AddRedScore implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			redScore++;
			redScoreLabel.setText(Integer.toString(redScore));
		}
	}

	public class AddBlueScore implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			blueScore++;
			blueScoreLabel.setText(Integer.toString(blueScore));
		}
	}

	public class ResetScore implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			redScore = 0;
			blueScore = 0;
			redScoreLabel.setText(Integer.toString(redScore));
			blueScoreLabel.setText(Integer.toString(blueScore));
		}
	}

	public static void main(String[] args) {
		new Scoreboard();
	}
}
