package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Initialization of object in configuration (spring2.xml).
 */

public class DrawingApp3 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

		// Using bean
		Triangle3 triangle3_1 = (Triangle3) context.getBean("triangle3.1");
		triangle3_1.draw();

		// Using inner bean
		Triangle3 triangle3_2 = (Triangle3) context.getBean("triangle3.2");
		triangle3_2.draw();

		// Using name
		Triangle3 triangle3_3 = (Triangle3) context.getBean("triangle3.innerbean.name");
		triangle3_3.draw();

		// Using alias
		Triangle3 triangle3_4 = (Triangle3) context.getBean("triangle3.innerbean");
		triangle3_4.draw();

	}
}
