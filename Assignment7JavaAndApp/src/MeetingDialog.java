import javax.swing.*;

public class MeetingDialog extends JFrame {
	public MeetingDialog() {

		String name;
		int repeat;

		do {
			name = JOptionPane.showInputDialog(null, "Enter your name.");
			repeat = JOptionPane.showConfirmDialog(null, "Is " + name + " your name?", null, JOptionPane.YES_NO_OPTION);
		} while (repeat == JOptionPane.NO_OPTION);
		
		JOptionPane.showMessageDialog(null, "Nice to meet you " + name);
	}
	
	public static void main(String[] args) {
		MeetingDialog m = new MeetingDialog();
	}
}