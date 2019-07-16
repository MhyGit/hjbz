package com.hjbz.test.learning.factory.normal.impl;

import com.hjbz.test.learning.factory.normal.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("==================>>>>>画方形....");
	}
}
