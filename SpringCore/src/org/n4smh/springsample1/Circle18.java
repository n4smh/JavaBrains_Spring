package org.n4smh.springsample1;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle18 implements Shape1, ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher publisher;

	public Point getCenter() {
		return center;
	}

	@Resource(name = "center")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Center point = (" + center.getX() + "," + center.getY() + ")");

		// DrawEvent is an custom Event, it's been published below using publisher.
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
