package org.n4smh.springsample1;

public class Triangle3 {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("pointA = (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("pointB = (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("pointC = (" + pointC.getX() + "," + pointC.getY() + ")");
	}

}
