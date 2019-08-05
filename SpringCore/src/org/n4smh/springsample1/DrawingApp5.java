package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Object initialization by autowiring: byName, byType (default), constructor.
 * 
 * Bean initialization Scopes
 * 
 *  singleton -> Default, one instance is returned for all getBean() call
 *  prototype -> Different instance is returned for each getBean() call
 *  
 *  Web aware Scopes
 *  request -> Instance is created for each HTTP request
 *  session -> Instance is created per session
 *  global-session -> Instance is created per Global session
 *  
 * */

public class DrawingApp5 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");

		// byType
		Triangle5 triangle5_1 = (Triangle5) context.getBean("triangle5.1");
		triangle5_1.draw();

		// constructor
		Triangle5 triangle5_2 = (Triangle5) context.getBean("triangle5.2");
		triangle5_2.draw();
	}
}
