package essay;

import java.util.Scanner;

public class TestEssay {

	public static void main(String[] args) {

		double grammar;
		double spelling;
		double content;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the scores received for each category of the essay.");

		System.out.print("Grammar: ");
		grammar = input.nextDouble();
		if (grammar < 0 || grammar > 25) 
			System.out.println("Invalid entry. Value replaced with 0.");

		System.out.print("Spelling: ");
		spelling = input.nextDouble();
		if (spelling < 0 || spelling > 35) 
			System.out.println("Invalid entry. Value replaced with 0.");

		System.out.print("Content: ");
		content = input.nextDouble();
		if (content < 0 || content > 40) 
			System.out.println("Invalid entry. Value replaced with 0.");

		Essay e = new Essay(grammar, spelling, content);

		System.out.println("\nScores are as follows:\nGrammar: " + e.getGrammar() + "\nSpelling: " + e.getSpelling()
				+ "\nContent: " + e.getContent() + "\nTotal Score: " + e.getScore() + "\nGrade: " + e.getGrade());
	}
}
