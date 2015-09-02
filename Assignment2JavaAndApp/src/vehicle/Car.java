package vehicle;

public class Car extends Automobile {

	private int maxPassengers;

	public Car() {
		super();
		maxPassengers = 5;
	}

	public Car(int year, double weight, String licensePlate, String make,
			int maxPassengers) {
		super(year, weight, licensePlate, make);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public String toString() {
		return "Car: " + super.toString() + ", Max Passengers: " + maxPassengers;
	}

}
