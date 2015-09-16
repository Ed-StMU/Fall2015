
public class TestInterface {

	public static void main(String[] args) {

		Circle c = new Circle(5);
		Rectangle r = new Rectangle(11, 8.5);

		System.out.println("Circle area: " + c.getArea());
		System.out.println("Rectangle area: " + r.getArea());

		if (c.equals(r))
			System.out.println("The areas are equal.");

		if (c.isGreater(r))
			System.out.println("Area of the circle is greater than area of the rectangle.");

		if (c.isLess(r))
			System.out.println("Area of the circle is smaller than area of the rectangle.");
	}
}
