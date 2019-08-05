package org.n4smh.springsample1;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle16 implements Shape1 {

	private Point center;
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "center")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default", null));
		
		// Passing values to property file message as array.
		System.out.println(this.messageSource.getMessage("drawing.circle.center",
				new Object[] { center.getX(), center.getY() }, "Default", Locale.ENGLISH));
		
		System.out.println("Greetings: " + this.messageSource.getMessage("greeting", null, "Default", Locale.FRENCH));
	}

}
