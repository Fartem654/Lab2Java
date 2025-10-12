package Line;

import Point.Point;

public class Line {

	private Point start;
	private Point end;

	public Line(Point start, Point end) { //4.2
		setStart(start);
		setEnd(end);
	}

	public Line(double startX, double startY, double endX, double endY) { //4.2
		setStart(new Point(startX, startY));
		setEnd(new Point(endX, endY));
	}

	public Line(Line line) {
		this.start = line.start;
		this.end = line.end;
	}

	public void setStart(double x, double y) {
		if (this.start != null) {
			this.start.setX(x);
			this.start.setY(y);
		} else {
			this.start = new Point(x, y);
		}
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	/*public Line() {
		this.start = new Point(0, 0);
		this.end = new Point(0, 0);
	}*/

	public void setEnd(double x, double y) {
		if (this.end != null) {
			this.end.setX(x);
			this.end.setY(y);
		} else {
			this.end = new Point(x, y);
		}
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int lineLength() {
		double length = 0;
		double lenX = end.getX() - start.getX();
		double lenY = end.getY() - start.getY();
		length = Math.sqrt(lenX * lenX + lenY * lenY);
		return (int) Math.round(length);
	}

	@Override
	public String toString() {
		return "Линия от " + start.toString() + " до " + end.toString();
	}
}


/*private void startLessEnd(){ ?
		if(this.start.getX() > this.end.getX()) {
			Point temp = this.end;
			this.end = this.start;
			this.start = temp;
		}
	}*/
//startLessEnd();