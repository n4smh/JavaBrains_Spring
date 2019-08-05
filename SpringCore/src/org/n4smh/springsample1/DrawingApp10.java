package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Coding to interface
 * 
 * */

public class DrawingApp10 {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
		context.registerShutdownHook();

		Triangle10 triangle1 = (Triangle10) context.getBean("triangle1");
		triangle1.draw();

		Circle10 circle1 = (Circle10) context.getBean("circle1");
		circle1.draw();
		
		System.out.println();
		
		Shape1 shape1 = (Shape1) context.getBean("triangle1");
		shape1.draw();
		
		Shape1 shape2 = (Shape1) context.getBean("circle1");
		shape2.draw();

	}
}
