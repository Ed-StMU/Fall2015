public class Circle extends GeometricObject implements Comparable {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {

		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public boolean equals(GeometricObject g) {
		if (this.getArea() == g.getArea())
			return true;
		else
			return false;
	}
	
	public boolean isGreater(GeometricObject g) {
		if (this.getArea() > g.getArea())
			return true;
		else
			return false;
	}
	
	public boolean isLess(GeometricObject g) {
		if (this.getArea() < g.getArea())
			return true;
		else
			return false;
	}
}
