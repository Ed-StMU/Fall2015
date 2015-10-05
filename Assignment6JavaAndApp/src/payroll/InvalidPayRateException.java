package payroll;

public class InvalidPayRateException extends Exception {
	public InvalidPayRateException() {
		super("Error: Negative value or value greater than 25 entered for pay rate.");
	}

	public InvalidPayRateException(double payRate) {
		super("Error: Negative value or value greater than 25 entered for pay rate: " + payRate);
	}
}
