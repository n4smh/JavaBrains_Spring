package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Required bean post processor
 * 
 * If the required field is not set it will be caught in the bean initialization phase itself, 
 * much before code execution 
 * 
 * */

public class DrawingApp11 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring8.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle1");
		shape1.draw();

	}
}
