package org.n4smh.springsample1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle6 implements ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

	public Triangle6() {

	}

	public Triangle6(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
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
	public void setBeanName(String beanName) {
		System.out.println("Bean name is " + beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		this.pointA = (Point) context.getBean("pointA");
		this.pointB = (Point) context.getBean("pointB");
		this.pointC = (Point) context.getBean("pointC");
		
		// Scope workout, change pointA scope to prototype to see the below change.
		/*System.out.println("pointA prototype scope:");
		System.out.println(((Point) context.getBean("pointA")).toString());
		System.out.println(((Point) context.getBean("pointA")).toString());
		System.out.println(((Point) context.getBean("pointA")).toString());*/
	}
}
