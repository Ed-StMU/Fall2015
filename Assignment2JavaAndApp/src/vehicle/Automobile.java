package vehicle;

public class Automobile extends Vehicle {

	private String licensePlate;
	private String make;

	public Automobile() {
		super();
		licensePlate = "Unknown";
		make = "N/A";
	}

	public Automobile(int year, double weight, String licensePlate, String make) {
		super(year, weight);
		this.licensePlate = licensePlate;
		this.make = make;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String toString() {
		return super.toString() + ", License Plate: " + licensePlate + ", Make: " + make;
	}
}
