package Point;

public class Point {

	private double x;
	private double y;

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	/*public Point() { //по условию 4.1 низя
		setX(0);
		setY(0);
	}*/

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

	/*public Point(Point point) { //по условию 4.1 низя
		setX(point.x);
		setY(point.y);
	}*/

	@Override
	public String toString() {
		return "{" + x + ";" + y + "}";
	}
}
