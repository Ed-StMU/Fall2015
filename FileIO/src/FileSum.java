import java.io.*;
import java.util.Scanner;

public class FileSum {
	public static void main(String[] args) {

		try {

			// Write to the sum file
			PrintWriter p = new PrintWriter("Sum.txt");
			Scanner keyboard = new Scanner(System.in);
			int i = 0;
			int sum = 0;
			while (i != -1) {
				System.out.println("Enter a number (-1 to exit): ");
				i = keyboard.nextInt();
				if (i != -1) {
					sum += i;
					p.print(i + " ");
				}
			}
			p.close();

			// Read from the sum file
			File f = new File("Sum.txt");
			Scanner inputFile = new Scanner(f);

			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				System.out.println(line);
			}
			inputFile.close();

			// Print sum
			System.out.println("Sum: " + sum);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}