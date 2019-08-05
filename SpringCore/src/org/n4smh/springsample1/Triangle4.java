package org.n4smh.springsample1;

import java.util.List;

public class Triangle4 {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("pointA = (" + point.getX() + "," + point.getY() + ")");
		}
	}

}
