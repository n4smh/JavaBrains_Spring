package org.n4smh.springsample1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle13 implements Shape1 {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name = "point3Bean")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Center point = (" + center.getX() + "," + center.getY() + ")");
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Inside init circle");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("Inside destroy circle");
	}

}
