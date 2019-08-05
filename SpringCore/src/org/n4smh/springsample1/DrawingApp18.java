package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Event handling in spring
 * 
 * Three components are,
 * Event - Listener - Publisher 
 * 
 * ApplicationListener is implemented by class to catch all the events that occur.
 * 
 * Custom publisher is created by extending ApplicationEvent to class.
 * ApplicationEventPublisher and ApplicationEventPublisherAware are used to publish the custom events.  
 * 
 * */

public class DrawingApp18 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle18");
		shape1.draw();
	}
}
