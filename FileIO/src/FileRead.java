import java.io.*;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		try {
			File f = new File("Test.txt");
			Scanner inputFile = new Scanner(f);

			while (inputFile.hasNext()) {

				String line = inputFile.nextLine();
				System.out.println(line);
			}
			inputFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}