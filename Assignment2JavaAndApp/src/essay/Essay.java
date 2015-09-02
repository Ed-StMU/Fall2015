package essay;

public class Essay extends GradedActivity {

	private double grammar;
	private double spelling;
	private double content;

	public Essay(double grammar, double spelling, double content) {

		double total;

		if (grammar >= 0 && grammar <= 25)
			this.grammar = grammar;
		else 
			this.grammar = 0;

		if (spelling >= 0 && spelling <= 35)
			this.spelling = spelling;
		else 
			this.spelling = 0;

		if (content >= 0 && content <= 40)
			this.content = content;
		else
			this.content = 0;

		total = this.content + this.spelling + this.grammar;
		setScore(total);
	}

	public double getGrammar() {
		return grammar;
	}

	public double getSpelling() {
		return spelling;
	}

	public double getContent() {
		return content;
	}
}
