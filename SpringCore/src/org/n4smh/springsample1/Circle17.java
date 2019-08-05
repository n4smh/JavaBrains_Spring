package org.n4smh.springsample1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle17 implements Shape1 {

	private Point center;

	@Value("${greeting}")
	private String greeting;

	@Value("${drawing.circle.center}")
	private String drawingCircleCenter;

	@Value("${drawing.circle}")
	private String drawingCircle;

	public Point getCenter() {
		return center;
	}

	@Resource(name = "center")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(greeting);

		System.out.println(drawingCircleCenter);
		
		System.out.println(drawingCircle);
	}

}
