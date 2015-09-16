public class Rectangle extends GeometricObject implements Comparable {

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
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