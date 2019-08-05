package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Property file access.
 * 
 * */

public class DrawingApp15 {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring11.xml");
		context.registerShutdownHook();

		String greeting = context.getMessage("greeting", null, "Default", null);
		System.out.println(greeting);
	}
}
