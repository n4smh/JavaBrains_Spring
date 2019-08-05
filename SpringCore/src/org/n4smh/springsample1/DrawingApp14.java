package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Annotations
 * 
 * Advantage of xml over annotation is that,
 * it is possible to create different bean with different meta data of the same class.
 * 
 * component-scan: 	Specifies the class to be scanned for beans. Should be mentioned in spring-context.xml
 * 					It looks for Stereotypes 
 * 					@Component (Generic - Default),  
 * 					@Service, 
 * 					@Repository (data object), 
 * 					@Controller.
 * 
 * @Component: Class out of which beans should be created.
 * 
 * */

public class DrawingApp14 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle14");
		shape1.draw();

	}
}
