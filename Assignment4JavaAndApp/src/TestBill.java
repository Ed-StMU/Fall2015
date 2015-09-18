import java.util.Scanner;

public class TestBill {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LongDistanceBill b = new LongDistanceBill();

		System.out.println("What is your call rate?");
		b.setCallRate(input.nextDouble());

		System.out.println("What is your monthly rate?");
		b.setMonthlyRate(input.nextDouble());

		System.out.println("How many minutes did you talk?");

		System.out.println("Your monthly bill is $" + b.calculateBill(input.nextInt()));
	}
}