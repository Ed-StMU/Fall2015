package vehicle;

import java.util.*;

public class TestAutomobile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Car c = new Car();
		Truck t = new Truck();
		Tank a = new Tank();
		
		System.out.println("Default values for the vehicles:\n" + c.toString() + "\n" + t.toString() + "\n" + a.toString() + "\n");

		System.out.println("Enter information for the vehicles below.\n");

		System.out.print("Car\nYear: ");
		c.setYear(input.nextInt());
		System.out.print("Weight: ");
		c.setWeight(input.nextDouble());
		System.out.print("License Plate: ");
		c.setLicensePlate(input.next());
		System.out.print("Make: ");
		c.setMake(input.next());
		System.out.print("Max Passengers: ");
		c.setMaxPassengers(input.nextInt());

		System.out.print("\nTruck\nYear: ");
		t.setYear(input.nextInt());
		System.out.print("Weight: ");
		t.setWeight(input.nextDouble());
		System.out.print("License Plate: ");
		t.setLicensePlate(input.next());
		System.out.print("Make: ");
		t.setMake(input.next());
		System.out.print("Tow Capacity: ");
		t.setTowCapacity(input.nextDouble());

		System.out.print("\nTank\nYear: ");
		a.setYear(input.nextInt());
		System.out.print("Weight: ");
		a.setWeight(input.nextDouble());
		System.out.print("Armor Width: ");
		a.setArmorWidth(input.nextDouble());

		System.out.println("\n" + c.toString() + "\n" + t.toString() + "\n" + a.toString());
	}
}
