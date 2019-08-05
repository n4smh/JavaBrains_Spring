package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * BeanPostProcessor
 * 
 * Executes for each of the bean specified in spring.xml
 * 
 * */

public class DrawingApp9 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
		context.registerShutdownHook();

		Triangle3 triangle1 = (Triangle3) context.getBean("triangle1");
		triangle1.draw();
		
	}
}
