package vehicle;

public class Truck extends Automobile {

	private double towCapacity;

	public Truck() {
		super();
		towCapacity = 2000.0;
	}

	public Truck(int year, double weight, String licensePlate, String make,
			double towCapacity) {
		super(year, weight, licensePlate, make);
		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
	}

	public String toString() {
		return "Truck: " + super.toString() + ", Tow Capacity: " + towCapacity;
	}

}
