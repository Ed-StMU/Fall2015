package divide;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int quotient;

		System.out.println("Enter 2 numbers to be divided.\nNumber 1: ");

		try {
			num1 = input.nextInt();
			System.out.println("Number 2: ");
			num2 = input.nextInt();
			quotient = num1 / num2;
			System.out.println("Quotient: " + quotient);
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		}

		catch (InputMismatchException e) {
			System.out.println("InputMismatchException caught");
		}

		catch (Exception e) {
			System.out.println("Exception caught");
		}

		finally {
			System.out.println("End of program.");
		}
	}
}