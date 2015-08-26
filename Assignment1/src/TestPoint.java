import java.util.*;

public class TestPoint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;

		System.out.println("FIRST POINT Enter x coordinate: ");
		x1 = input.nextDouble();

		System.out.println("FIRST POINT Enter y coordinate: ");
		y1 = input.nextDouble();

		ThePoint p = new ThePoint(x1, y1);

		System.out.println("SECOND POINT Enter x coordinate: ");
		x2 = input.nextDouble();

		System.out.println("SECOND POINT Enter x coordinate: ");
		y2 = input.nextDouble();

		ThePoint q = new ThePoint(x2, y2);

		System.out.println("Points: (" + p.getX() + "," + p.getY() + ") and (" + q.getX() + "," + q.getY()
				+ ") \nDistance: " + p.distance(p, q));
	}
}
