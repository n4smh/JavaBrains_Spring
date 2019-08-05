package org.n4smh.springsample1;

public class Triangle2 {

	// Constructor injection
	private String type;
	private int height;

	/* Constructor overloading is allowed */
	public Triangle2(String type) {
		this.type = type;
	}

	/*
	 * Creates the potential problem as by default String value is specified in
	 * configuration resulting in wrong constructor invocation. So specify type
	 * of argument in configuration. And same with the argument order, specify index.
	 */
	public Triangle2(int height) {
		this.height = height;
	}

	public Triangle2(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println(getType() + " Triangle draw of height " + getHeight());
	}

}
