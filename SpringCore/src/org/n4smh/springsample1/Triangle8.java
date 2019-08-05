package org.n4smh.springsample1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle8 implements InitializingBean, DisposableBean {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle8() {
		System.out.println("Default constructor");
	}

	public Triangle8(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		System.out.println("Parameterised constructor");
	}

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called for Triangle");
	}

	public void myInit() {
		System.out.println("My init method called for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called for Triangle");
	}

	public void myCleanUp() {
		System.out.println("My cleanup method called for Triangle");
	}
}
