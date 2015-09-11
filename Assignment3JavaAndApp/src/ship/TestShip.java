package ship;

public class TestShip {

	public static void main(String[] args) {
		// Create an array of ships
		Ship[] boats = new Ship[3];

		// First ship
		boats[0] = new Ship("RMS Titanic", "1912");

		// Second ship is a cruise ship
		boats[1] = new CruiseShip("Disney Fantasy", "", 4000);

		// Third ship is a cargo ship
		boats[2] = new CargoShip("SS Atlantic Causeway", "", 14946);

		// Display the ships
		for (int i = 0; i < boats.length; i++) {
			System.out.println(boats[i].toString());
			System.out.println("---------------------------------");
		}
	}
}