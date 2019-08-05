package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp4 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

		// List initialization using spring configuration
		Triangle4 triangle4_1 = (Triangle4) context.getBean("triangle4.1");
		triangle4_1.draw();
	}
}
