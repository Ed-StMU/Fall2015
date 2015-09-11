package ship;

public class CruiseShip extends Ship {

	private int maxPassengers;

	public CruiseShip(String name, String year, int maxPassengers) {
		super(name, year);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public String toString() {
		return "Name: " + name + "\nMax Passengers: " + maxPassengers;
	}
}