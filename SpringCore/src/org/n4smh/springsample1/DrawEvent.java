package org.n4smh.springsample1;

import org.springframework.context.ApplicationEvent;

//Custom event
public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Draw Event Occured";
	}

}
