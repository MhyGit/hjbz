package com.hjbz.test.learning.factory.normal;

public class TestShapeFactory {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();

		factory.getShape("circle").draw();

		factory.getShape("rectangle").draw();

		factory.getShape("square").draw();


	}


}
