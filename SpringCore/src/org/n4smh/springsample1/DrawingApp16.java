package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Property file access using MessageSource 
 * 
 * Using arguments with property file 
 * 
 * Access based on Locale:	It can be achieved by providing proper locale for property file 
 * 							like filename_<locale>.properties
 * 
 * 
 * ReloadableResourceBundleMessageSource: 	It is used for parameterization and internationalization of messages.
 * 											It allows reload of values from property file as it changes.
 * 											A value of -1 keeps resource bundle cached forever. A value of 1 or 
 * 											more is recommended for good performance in message resolution. This 
 * 											class also accepts file base prefixes in basenames (e.g. classpath:, file:)
 * 
 * PropertyPlaceholderConfigurer:	It is used when property is being read is used in application context of spring.
 * 									Properties could be used directly by JSTL expressions.	
 * 									Disadvantage is it doesn't support parameterization and internationalization of messages.
 * 
 * */

public class DrawingApp16 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring12.xml");
		context.registerShutdownHook();

		Shape1 shape1 = (Shape1) context.getBean("circle16");
		shape1.draw();
	}
}
