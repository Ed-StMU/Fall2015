package ship;

public class Ship {

	public String name;
	public String year;

	public Ship(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String toString() {
		return "Name: " + name + "\nYear built: " + year;
	}
}