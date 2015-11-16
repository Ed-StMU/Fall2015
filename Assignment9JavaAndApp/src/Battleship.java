
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

public class Battleship extends JFrame {

	static Random rand = new Random();

	static int r1 = rand.nextInt(2) + 1;
	static int r2 = rand.nextInt(2) + 1;
	static int horizontal = 1;
	static int vertical = 2;
	static int ship1x;
	static int ship1y;

	static int ship2Hx;
	static int ship2Hy;
	static int ship2Vx;
	static int ship2Vy;

	static int ship3Hx;
	static int ship3Hy;
	static int ship3Vx;
	static int ship3Vy;

	static int totalMoves = 0;
	static int sunkenShips = 0;

	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JLabel gameOver = new JLabel("");

	JPanel[][] location = new JPanel[7][7];

	public Battleship() {

		setTitle("Battleship");
		setSize(600, 600);

		JPanel main = new JPanel();
		main.setLayout(new GridLayout(7, 7, 2, 2));
		JPanel scoreboard = new JPanel();
		scoreboard.setLayout(new FlowLayout());

		JLabel label1 = new JLabel("Total Moves:");
		text1.setEditable(false);
		JLabel label2 = new JLabel("Sunken Ships:");
		text2.setEditable(false);

		scoreboard.add(label1);
		scoreboard.add(text1);
		scoreboard.add(label2);
		scoreboard.add(text2);
		scoreboard.add(gameOver);

		ship1x = rand.nextInt(6) + 0;
		ship1y = rand.nextInt(6) + 0;

		location[ship1x][ship1y] = new JPanel();
		do{
			ship2Hx = rand.nextInt(5)+0;
			ship2Hy = rand.nextInt(6)+0;
			location[ship2Hx][ship2Hy]= new JPanel();
			}while(location[ship2Hx][ship2Hy]==location[ship1x][ship1y]
					||location[ship2Hx+1][ship2Hy]==location[ship1x][ship1y]);
		do{
			ship2Vx = rand.nextInt(6)+0;
			ship2Vy = rand.nextInt(5)+0;
			location[ship2Vx][ship2Vy]= new JPanel();
			}while(location[ship2Vx][ship2Vy]==location[ship1x][ship1y]
					||location[ship2Vx][ship2Vy+1]==location[ship1x][ship1y]);
		do{	
		ship3Hx = rand.nextInt(5)+1;
		ship3Hy = rand.nextInt(6)+0;
		location[ship3Hx][ship3Hy]= new JPanel();
		}while(location[ship3Hx][ship3Hy]==location[ship2Hx][ship2Hy] ||location[ship3Hx][ship3Hy]==location[ship1x][ship1y]
				||location[ship3Hx][ship3Hy]==location[ship2Vx][ship2Vy]);
		do{
			ship3Vx = rand.nextInt(6)+0;
			ship3Vy = rand.nextInt(5)+1;
			location[ship3Vx][ship3Vy]= new JPanel();
		}while(location[ship3Vx][ship3Vy]==location[ship2Hx][ship2Hy] ||location[ship3Vx][ship3Vy]==location[ship1x][ship1y]
				||location[ship3Vx][ship3Vy]==location[ship2Vx][ship2Vy]);
		
		for (int x = 0; x < 7; x++) {
			for (int y = 0; y < 7; y++) {
				location[x][y] = new JPanel();
				location[x][y].setBackground(Color.BLUE);
				main.add(location[x][y]);
				location[x][y].addMouseListener(new Listener());
			}
		}

		add(main, BorderLayout.CENTER);
		add(scoreboard, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class Listener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {

			e.getComponent().setBackground(Color.WHITE);

			if (e.getComponent() == location[ship1x][ship1y]) {
				location[ship1x][ship1y].setBackground(Color.RED);
				sunkenShips++;
			}

			if (r1 == horizontal) {
				if (e.getComponent() == location[ship3Hx][ship3Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship3Hx + 1][ship3Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship3Hx - 1][ship3Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (location[ship3Hx][ship3Hy].getBackground() == Color.YELLOW
						&& location[ship3Hx + 1][ship3Hy].getBackground() == Color.YELLOW
						&& location[ship3Hx - 1][ship3Hy].getBackground() == Color.YELLOW) {
					location[ship3Hx][ship3Hy].setBackground(Color.RED);
					location[ship3Hx + 1][ship3Hy].setBackground(Color.RED);
					location[ship3Hx - 1][ship3Hy].setBackground(Color.RED);
					sunkenShips++;
				}
			} else if (r1 == vertical) {
				if (e.getComponent() == location[ship3Hx][ship3Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship3Hx][ship3Hy + 1])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship3Hx][ship3Hy - 1])
					e.getComponent().setBackground(Color.YELLOW);
				if (location[ship3Hx][ship3Hy].getBackground() == Color.YELLOW
						&& location[ship3Hx][ship3Hy + 1].getBackground() == Color.YELLOW
						&& location[ship3Hx][ship3Hy - 1].getBackground() == Color.YELLOW) {
					location[ship3Hx][ship3Hy].setBackground(Color.RED);
					location[ship3Hx][ship3Hy + 1].setBackground(Color.RED);
					location[ship3Hx][ship3Hy - 1].setBackground(Color.RED);
					sunkenShips++;
				}
			}

			if (r2 == horizontal) {
				if (e.getComponent() == location[ship2Hx][ship2Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship2Hx + 1][ship2Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (location[ship2Hx][ship2Hy].getBackground() == Color.YELLOW
						&& location[ship2Hx + 1][ship2Hy].getBackground() == Color.YELLOW) {
					location[ship2Hx][ship2Hy].setBackground(Color.RED);
					location[ship2Hx + 1][ship2Hy].setBackground(Color.RED);
					sunkenShips++;
				}
			} else if (r2 == vertical) {
				if (e.getComponent() == location[ship2Hx][ship2Hy])
					e.getComponent().setBackground(Color.YELLOW);
				if (e.getComponent() == location[ship2Hx][ship2Hy + 1])
					e.getComponent().setBackground(Color.YELLOW);
				if (location[ship2Hx][ship2Hy].getBackground() == Color.YELLOW
						&& location[ship2Hx][ship2Hy + 1].getBackground() == Color.YELLOW) {
					location[ship2Hx][ship2Hy].setBackground(Color.RED);
					location[ship2Hx][ship2Hy + 1].setBackground(Color.RED);
					sunkenShips++;
				}
			}

			totalMoves++;
			text1.setText(Integer.toString(totalMoves));
			text2.setText(Integer.toString(sunkenShips));

			if (sunkenShips == 3)
				gameOver.setText("Game Over!");
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			if (e.getComponent().getBackground() == Color.BLUE)
				e.getComponent().setBackground(Color.lightGray);
		}

		public void mouseExited(MouseEvent e) {
			if (e.getComponent().getBackground() == Color.lightGray)
				e.getComponent().setBackground(Color.BLUE);
		}
	}

	public static void main(String[] args) {

		Battleship c = new Battleship();
		System.out.println(c.getContentPane());
	}
}
