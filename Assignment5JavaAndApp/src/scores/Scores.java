package scores;

public class Scores {

	private int scores[] = new int[5];

	public Scores(int scoreList[]) {
		for (int x = 0; x < scoreList.length; x++) {
			if (scoreList[x] < 0 || scoreList[x] > 100)
				throw new IllegalArgumentException("ERROR: Invalid score value(s)");
			else
				scores[x] = scoreList[x];
		}
		System.out.println("Average: " + calculateAverage());
	}

	public double calculateAverage() {
		int sum = 0;
		double average = 0;
		for (int x = 0; x < scores.length; x++) {
			sum += scores[x];
		}
		average = sum / scores.length;
		return average;
	}
}