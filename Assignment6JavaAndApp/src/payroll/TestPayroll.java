package payroll;

public class TestPayroll {

	public static void main(String[] args) {

		// Negative ID
		try {
			Payroll p1 = new Payroll("Bob", -100);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		}

		// Empty String
		try {
			Payroll p2 = new Payroll("", 1234);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		}

		// Invalid Hours
		try {
			Payroll p3 = new Payroll("Bill", 2345);
			p3.setHours(85);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidHoursException e) {
			System.out.println(e.getMessage());
		}

		// Invalid Pay Rate
		try {
			Payroll p4 = new Payroll("Jim", 3456);
			p4.setPayRate(26);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRateException e) {
			System.out.println(e.getMessage());
		}

		// Everything valid
		try {
			Payroll p5 = new Payroll("John", 4567);
			p5.setHours(40);
			p5.setPayRate(20);
			System.out.println("\nName: " + p5.getName() + "\nID Number: " + p5.getIDNumber() + "\nPay Rate: "
					+ p5.getPayRate() + "\nHours: " + p5.getHours() + "\nGross Pay: " + p5.calculateGrossPay());
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (InvalidIDException e) {
			System.out.println(e.getMessage());
		} catch (InvalidHoursException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRateException e) {
			System.out.println(e.getMessage());
		}

	}
}