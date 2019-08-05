package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ApplicationContextAware -> Used to get application context once initialized in bean 
 *  
 * BeanNameAware -> Used to fetch parent bean name
 *  
 * */

public class DrawingApp6 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");

		Triangle6 triangle6_1 = (Triangle6) context.getBean("triangle6");
		triangle6_1.draw();
		
		// Scope workout, change triangle6 scope to prototype to see the below change.
		/*System.out.println(triangle6_1.toString());
		System.out.println(triangle6_1.getPointA().toString());
		
		Triangle6 triangle6_2 = (Triangle6) context.getBean("triangle6");
		
		System.out.println(triangle6_2.toString());
		System.out.println(triangle6_2.getPointA().toString());*/
	}
}
