package org.n4smh.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {

	public static void main(String[] args) {
		// Triangle1 triangle = new Triangle1();

		/*
		 * This needs spring.xml to be in root directory of project. Light
		 * weight. Used in crucial applications.
		 */
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring1.xml"));
		// Triangle1 triangle = (Triangle1) factory.getBean("triangle1");

		/*
		 * This needs spring.xml to be in classpath.Easy to use and provides
		 * additional functionality than BeanFactory.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		
		Triangle1 triangle1 = (Triangle1) context.getBean("triangle1");
		triangle1.draw();
		
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw();
		
	}

}
