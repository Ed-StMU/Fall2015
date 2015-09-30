package scores;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int scoreList[] = new int[5];
		System.out.println("Enter the test scores: ");
		for (int x = 0; x < scoreList.length; x++) {
			scoreList[x] = input.nextInt();
		}

		try {
			Scores s = new Scores(scoreList);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("End of program.");
		}
	}
}