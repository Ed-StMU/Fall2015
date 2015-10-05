package payroll;

public class InvalidNameException extends Exception {

	public InvalidNameException() {
		super("Error: Empty string for employee's name.");
	}
}