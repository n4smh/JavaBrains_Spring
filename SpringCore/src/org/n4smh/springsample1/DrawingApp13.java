package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * JSR250 (JAVA Specification Request) annotations
 * 
 * @Resource:	Dependency injection
 * @PostConstruct:	Called immediately after bean initialization.
 * @PreDestroy:	Called just before bean being destroyed.
 * 
 * */

public class DrawingApp13 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle2");
		shape1.draw();

	}
}
