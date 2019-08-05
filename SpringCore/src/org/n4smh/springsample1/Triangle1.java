package org.n4smh.springsample1;

public class Triangle1 {

	/*
	 * Member variable can be initialized by spring configuration file
	 * (spring2.xml).
	 */
	// Setter injection
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle draw");
	}
}
