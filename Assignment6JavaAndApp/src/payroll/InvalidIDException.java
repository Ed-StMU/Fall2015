package payroll;

public class InvalidIDException extends Exception {

	public InvalidIDException() {
		super("Error: Negative ID number");
	}

	public InvalidIDException(int IDNumber) {
		super("Error: Negative ID number: " + IDNumber);
	}
}
