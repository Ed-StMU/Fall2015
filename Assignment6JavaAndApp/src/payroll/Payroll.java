package payroll;

public class Payroll {

	private String name;
	private int IDNumber;
	private double payRate;
	private double hours;

	public Payroll() {
	}

	public Payroll(String name, int IDNumber) throws InvalidNameException, InvalidIDException {
		if (name == "")
			throw new InvalidNameException();
		else
			this.name = name;

		if (IDNumber < 0)
			throw new InvalidIDException();
		else
			this.IDNumber = IDNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) throws InvalidPayRateException {
		if (payRate >= 0 && payRate <= 25)
			this.payRate = payRate;
		else
			throw new InvalidPayRateException(payRate);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) throws InvalidHoursException {
		if (hours >= 0 && hours <= 84)
			this.hours = hours;
		else
			throw new InvalidHoursException(hours);
	}

	public double calculateGrossPay() {
		return payRate * hours;
	}
}
