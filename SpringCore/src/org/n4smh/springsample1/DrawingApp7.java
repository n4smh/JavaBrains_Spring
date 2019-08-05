package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Bean definition inheritance
 * 
 * In case of collection to merge the data in child along with parent use merge=true in list tag
 *    
 * */

public class DrawingApp7 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

		// ChildTriangle1 inherits parentTriangle containing pointA definition
		// and defines pointB, pointC. Draw will execute with no
		// exception.
		Triangle7 childTriangle1 = (Triangle7) context.getBean("childTriangle1");
		childTriangle1.draw();

		// ChildTriangle2 inherits parentTriangle containing pointA definition
		// and defines only pointB. Draw method call results in exception as
		// pointC is accessed in draw results in null.
		Triangle7 childTriangle2 = (Triangle7) context.getBean("childTriangle2");
		childTriangle2.draw();

	}
}
