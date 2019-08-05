package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Property file access using @Value
 * 
 * PropertyPlaceholderConfigurer:	It is used when property is being read is used in application context of spring.
 * 									Properties could be used directly by JSTL expressions.
 * 									Disadvantage is it doesn't support parameterization and internationalization of messages.
 * 
 * */

public class DrawingApp17 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring13.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle17");
		shape1.draw();
	}
}
