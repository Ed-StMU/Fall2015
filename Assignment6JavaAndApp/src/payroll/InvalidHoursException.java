package payroll;

public class InvalidHoursException extends Exception {
	public InvalidHoursException() {
		super("Error: Negative value or value greater than 84 entered for hours.");
	}

	public InvalidHoursException(double hours) {
		super("Error: Negative value or value greater than 84 entered for hours: " + hours);
	}
}
