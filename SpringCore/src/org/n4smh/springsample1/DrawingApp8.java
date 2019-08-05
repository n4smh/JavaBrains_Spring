package org.n4smh.springsample1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Bean initialization and destroy
 * 
 * By implementing InitializingBean, DisposableBean.
 * By specifying in configuration for each bean. 
 * By specifying in configuration for all bean by default.
 *
 * For all above ApplicationContext must be replaced with AbstractApplicationContext 
 * and context must be registered to shutdown hook.
 * 
 * */

public class DrawingApp8 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
		context.registerShutdownHook();

		Triangle8 childTriangle1 = (Triangle8) context.getBean("triangle1");
		childTriangle1.draw();

		Triangle8 childTriangle2 = (Triangle8) context.getBean("triangle2");
		childTriangle2.draw();

	}
}
