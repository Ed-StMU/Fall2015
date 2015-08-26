import java.lang.Math;

public class ThePoint {

	private double x, y;

	public ThePoint() {
		x = 0.0;
		y = 0.0;
	}

	public ThePoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(ThePoint p, ThePoint q) {
		double length1 = (p.getX() - q.getX());
		double length2 = (p.getY() - q.getY());
		double distance = Math.sqrt(((length1 * length1) + (length2 * length2)));
		return distance;
	}
}
