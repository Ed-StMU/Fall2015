import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {

		try {
			PrintWriter p = new PrintWriter("Test.txt");

			p.println("First Line");
			p.println("Second Line");
			p.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}