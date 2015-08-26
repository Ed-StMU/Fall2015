import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 1001);
		int guess;
		int counter = 1;
				
		//System.out.println(randomNumber);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Guess a number between 1 and 1000: ");
		guess = input.nextInt();
		
		while (guess != randomNumber){
			if (guess > randomNumber) {
				System.out.println("Too high! Try again.");
			}
			else if (guess < randomNumber) {
				System.out.println("Too low! Try again.");
			}
			counter++;
			guess = input.nextInt();
		}
		if (guess == randomNumber) {
			System.out.println("Congratulations. You guessed the number! It took you " + counter + " tries to find it.");
		}
	}
}
