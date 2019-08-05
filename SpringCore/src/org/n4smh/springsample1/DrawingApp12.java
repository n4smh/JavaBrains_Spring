package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Bean post processors
 * 
 * component-scan:	It is the simple way of including all the annotation post processor's in spring-context.xml
 * 
 * 
 * @Autowired: 	It autowires byType (by default) if it has only one bean even if the name is different.
 * 				If more than one bean with same type is present it looks to autowire byName.
 * 
 * @Qualifier:	It provides the hint while autowiring beans.
 * 
 * 
 * */

public class DrawingApp12 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle1");
		shape1.draw();

	}
}
