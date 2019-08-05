package org.n4smh.springsample1;

public class Circle10 implements Shape1 {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Center point = (" + center.getX() + "," + center.getY() + ")");
	}
}
