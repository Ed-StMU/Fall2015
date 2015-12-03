import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Personnel extends JFrame {

	public Personnel() {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/personnel", "root", "test4321");
			System.out.println("Connection created.");

			Statement st = con.createStatement();
			String sql = "CREATE TABLE Employee" + "( IDNumber CHAR(10) NOT NULL PRIMARY KEY, " + " Name CHAR(25), "
					+ " Position CHAR(25), " + " HourlyPayRate DOUBLE )";
			st.execute(sql);
			System.out.println("Table created.");

			sql = "INSERT INTO Employee VALUES" + "('1001', 'Bill', 'CEO', '50.25')";
			st.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" + "('1002', 'Joe', 'Sales Accountant', '25.75')";
			st.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" + "('1003', 'Greg', 'HR Assistant', '19.75')";
			st.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" + "('1004', 'Nat', 'Secretary', '11.25')";
			st.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" + "('1005', 'Fred', 'Custodian', '8.75')";
			st.executeUpdate(sql);

			String ID;
			String name;
			String position;
			String payRate;
			int addRow = 0;

			addRow = JOptionPane.showConfirmDialog(null, "Would you like to add a row to the table?", null,
					JOptionPane.YES_NO_OPTION);
			
			while (addRow == JOptionPane.YES_OPTION) {

				ID = JOptionPane.showInputDialog(null, "Enter employee ID.");
				name = JOptionPane.showInputDialog(null, "Enter employee's name.");
				position = JOptionPane.showInputDialog(null, "Enter employee's position title.");
				payRate = JOptionPane.showInputDialog(null, "Enter employee's hourly pay rate.");

				sql = "INSERT INTO Employee VALUES" + "('" + ID + "', '" + name + "', '" + position + "', '" + payRate
						+ "')";
				st.executeUpdate(sql);
				System.out.println("Row created.");
				JOptionPane.showMessageDialog(null, "Row successfully created.");
				addRow = JOptionPane.showConfirmDialog(null, "Would you like to add a row to the table?", null,
						JOptionPane.YES_NO_OPTION);
			}

			con.close();
			System.out.println("Connection closed.");

		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Personnel();
	}
}
